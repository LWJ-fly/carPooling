package online.wenmeng.service;

import online.wenmeng.bean.c_user;
import online.wenmeng.dao.c_userMapper;
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
    private c_userMapper userMapper;

    public String getUser(int id) {
        c_user c_user = userMapper.selectByPrimaryKey(id);
        if (c_user!=null)
            return c_user.toString();
        return null;
    }
}
