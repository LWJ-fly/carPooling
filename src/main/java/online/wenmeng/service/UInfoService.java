package online.wenmeng.service;

import online.wenmeng.bean.Uinfo;
import online.wenmeng.config.Config;
import online.wenmeng.dao.UinfoMapper;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.SentEmail;
import online.wenmeng.utils.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Service
public class UInfoService {

    @Autowired
    private UinfoMapper uinfoMapper;





    /**
     * 更新用户的基本信息
     * @param phone 用户的手机号
     * @param email 用户的邮箱
     * @param weChat 微信号
     * @param qqNum QQ号
     * @return 返回更新后的用户信息
     */
    public Map<String, Object> updateUserInfo(HttpSession session, String phone, String email, String weChat, String qqNum) {
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        Uinfo uinfo = uinfoMapper.selectByPrimaryKey(openId);
        if (uinfo==null){//居然之前没添加上？邮件通知我有问题
            SentEmail.sentEmail(Config.ReceiveMailNum,"服务器内部错误：online.wenmeng.service.UInfoService.updateUserInfo中数据之前没插入成功","服务器内部错误");
            Boolean i = insertUInfo(openId, (String) userLoginInfo.get(Config.NickName), userLoginInfo.get(Config.Gender).equals("男") ? 1 : 0);
            if (i){
                uinfo = uinfoMapper.selectByPrimaryKey(openId);
            }else {
                return MyUtils.getNewMap(Config.ERROR,Config.ERROR,"Server internal error, please try again later",null);
            }
        }
        int i = 0;
        if (VerifyUtil.isChinaPhoneLegal(phone)){
            i++;
            uinfo.setPhonenum(phone);
        }
        if (VerifyUtil.checkEmail(email)){
            i++;
            uinfo.setTallmail(email);
        }
        if (VerifyUtil.checkWXOrQQ(weChat)){
            i++;
            uinfo.setWxnum(weChat);
        }
        if (VerifyUtil.checkWXOrQQ(qqNum)){
            i++;
            uinfo.setQqnum(qqNum);
        }
        if (i==0){
            return MyUtils.getNewMap(Config.ERROR,Config.RETRY,"No update or parameter validation failed",null);
        }
        int update = uinfoMapper.updateByPrimaryKey(uinfo);
        if (update>0){
            return MyUtils.getNewMap(Config.SUCCESS,null,null,uinfoMapper.selectByPrimaryKey(uinfo.getUserid()));
        }
        return MyUtils.getNewMap(Config.ERROR,Config.RETRY,"Update error, please try again",null);
    }

    /**
     * 插入用户信息
     * @param userId 用户的ID
     * @param nickName 用户的昵称
     * @param sex 用户的性别
     * @return 返回是否插入成功
     */
    public Boolean insertUInfo(int userId,String nickName,int sex){
        Uinfo uinfo = new Uinfo();
        uinfo.setUserid(userId);
        uinfo.setUnickname(nickName);
        if (sex>0){
            uinfo.setSex(1);
        }else {
            uinfo.setSex(0);
        }
        uinfo.setUwallet(0d);
        uinfo.setUcredibility(10);
        if (uinfoMapper.insert(uinfo)>0){
            return true;
        }
        return false;
    }
}
