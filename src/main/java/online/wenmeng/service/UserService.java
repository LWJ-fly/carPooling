package online.wenmeng.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import online.wenmeng.bean.Ulogin;
import online.wenmeng.bean.UloginExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.UloginMapper;
import online.wenmeng.exception.ServerException;
import online.wenmeng.utils.HttpsRequest;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.SentEmail;
import online.wenmeng.utils.TransitionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.zip.CheckedOutputStream;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/19 0:16
 * @Descrintion: 用户登录使用的参数
 * @version: 1.0
 */
@Service
public class UserService {

    @Autowired
    private UloginMapper uloginMapper;

    public Map<String,Object> login(HttpSession session, String code) throws ServerException {
        if (code.length()==32){
            String request = HttpsRequest.httpsRequest("https://wenmeng.online/api/changeUserInfo/123456/"+ code, "GET", null);
            JSONObject json = JSON.parseObject(request);
            String state = json.getString(Config.STATE);
            //获取登录信息成功
            if (state!=null&&state.equals(Config.SUCCESS)){
                JSONObject qqInfo = json.getJSONObject(Config.DATA);
                Integer openid = qqInfo.getObject("openid", Integer.class);
                if (openid!=null){
                    UloginExample uloginExample = new UloginExample();
                    UloginExample.Criteria criteria = uloginExample.createCriteria();
                    criteria.andQqloginEqualTo(openid+"");
                    List<Ulogin> ulogins = uloginMapper.selectByExample(uloginExample);
                    Ulogin ulogin = null;
                    if (ulogins.size()>0){
                        ulogin = ulogins.get(0);
                    }
                    if (ulogin==null){//第一次登录
                        Ulogin insertUlogin = addULogin(openid + "");
                        if (insertUlogin!=null){//添加用户成功
                            Boolean aBoolean = new UInfoService().insertUInfo(insertUlogin.getUserid(), qqInfo.getString("nickname"), qqInfo.getString("gender").equals("男") ? 1 : 0);
                            if (aBoolean){
                                Map<String, Object> userLoginInfo = MyUtils.createUserLoginInfo(insertUlogin.getUserid(), qqInfo.getString("nickname"), qqInfo.getString("gender"), qqInfo.getString("figureurl_qq_1"));
                                session.setAttribute(Config.userInfoInRun,userLoginInfo);
                                return  MyUtils.getNewMap(Config.SUCCESS,Config.INDEX,null,userLoginInfo);
                            }
                        }
                    }else {
                        if (ulogin.getUsable()>0){
                            Map<String, Object> userLoginInfo = MyUtils.createUserLoginInfo(ulogin.getUserid(), qqInfo.getString("nickname"), qqInfo.getString("gender"), qqInfo.getString("figureurl_qq_1"));
                            session.setAttribute(Config.userInfoInRun,userLoginInfo);
                            return  MyUtils.getNewMap(Config.SUCCESS,Config.INDEX,null,userLoginInfo);
                        }else {
                            return MyUtils.getNewMap(Config.ERROR,Config.LOGIN,"The user has been disabled",null);
                        }
                    }
                }
                throw new ServerException();
            }
        }
        return MyUtils.getNewMap(Config.ERROR,Config.RETRY,"Parameter error",null);
    }

    /**
     * 退出登录
     * @return
     */
    public Map<String,Object> exit(HttpSession session){
        session.removeAttribute(Config.userInfoInRun);
        return MyUtils.getNewMap(Config.SUCCESS,Config.LOGIN,null,null);
    }

    /**
     * 由QQ添加用户信息
     * @param qqOpenId 从QQ那边获取的唯一码
     * @return 返回是否添加数据库成功
     */
    public Ulogin addULogin(String qqOpenId){
        Ulogin ulogin = new Ulogin();
        int openId ;
        while (true){
            openId = MyUtils.getRandomNum();
            if (uloginMapper.selectByPrimaryKey(openId)==null){
                break;
            }
        }
        ulogin.setUserid(openId);
        ulogin.setQqlogin(qqOpenId);
        ulogin.setUsable(1);
        if (uloginMapper.insert(ulogin)>0){
            return ulogin;
        }
        return null;
    }

    public Map<String, Object> sendEmail(HttpSession session, String title, String content) {
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        if (Config.sendEmailCountMap.containsKey(userLoginInfo.get(Config.Openid))){
            int count = Config.sendEmailCountMap.get(userLoginInfo.get(Config.Openid));
            if (count>Config.numberOfFeedback){
                return MyUtils.getNewMap(Config.ERROR,Config.ERROR,"Feedback more than three times, please try again tomorrow",null);
            }
            Config.sendEmailCountMap.put(TransitionUtil.transitionType(userLoginInfo.get(Config.Openid),int.class),count+1);
        }else {
            Config.sendEmailCountMap.put(TransitionUtil.transitionType(userLoginInfo.get(Config.Openid),int.class),1);
        }
        SentEmail.sentEmail(Config.ReceiveMailNum,content+"\r\n"+userLoginInfo,content);
        return MyUtils.getNewMap(Config.SUCCESS,null,"Thank you for your feedback. We will get better and better",null);
    }
}
