package online.wenmeng.service;

import online.wenmeng.bean.Uinfo;
import online.wenmeng.dao.UinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UInfoService {

    @Autowired
    private UinfoMapper uinfoMapper;

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
