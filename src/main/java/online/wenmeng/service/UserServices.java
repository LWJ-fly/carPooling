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
public class UserServices {

    @Autowired
    private UloginMapper uloginMapper;

    public Map<String,Object> getUser(HttpSession session, String code) throws ServerException {
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

                    }else {
                        Map<String, Object> userLoginInfo = MyUtils.createUserLoginInfo(openid, qqInfo.getString("nickname"), qqInfo.getString("gender"), qqInfo.getString("figureurl_qq_1"));
                        session.setAttribute(Config.userInfoInRun,userLoginInfo);
                        return  MyUtils.getNewMap(Config.SUCCESS,Config.INDEX,null,userLoginInfo);
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

}
