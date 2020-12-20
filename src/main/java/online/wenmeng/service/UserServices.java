package online.wenmeng.service;

import online.wenmeng.bean.ulogin;
import online.wenmeng.dao.uloginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/19 0:16
 * @Descrintion:
 * @version: 1.0
 */
@Service
public class UserServices {

    @Autowired
    private uloginMapper userMapper;

    public String getUser(int id) {
        ulogin ulogin = userMapper.selectByPrimaryKey(1);
        if (ulogin!=null)
            return ulogin.toString();
        return null;
    }
}
