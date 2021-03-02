package online.wenmeng.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import online.wenmeng.bean.Ulogin;
import online.wenmeng.config.Config;
import online.wenmeng.dao.UloginMapper;
import online.wenmeng.exception.ServerException;
import online.wenmeng.utils.HttpsRequest;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpSession;
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
                    Ulogin ulogin = uloginMapper.selectByPrimaryKey(openid);
                    if (ulogin==null){//第一次登录
                        Ulogin insertUlogin = addULogin(openid + "");
                        if (insertUlogin!=null){//添加用户成功
                            UInfoService uInfoService = new UInfoService();
                            Boolean aBoolean = uInfoService.insertUInfo(insertUlogin.getUserid(), qqInfo.getString("nickname"), qqInfo.getString("gender").equals("男") ? 1 : 0);
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

}
