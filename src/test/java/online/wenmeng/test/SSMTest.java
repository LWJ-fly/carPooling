package online.wenmeng.test;

import online.wenmeng.bean.Ulogin;
import online.wenmeng.dao.UinfoMapper;
import online.wenmeng.dao.UloginMapper;
import online.wenmeng.utils.MyUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/6 9:59
 * @Descrintion:
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SSMTest {


    @Autowired
    private UloginMapper uloginMapper;

    @Test
    public void fun(){

        Ulogin ulogin = uloginMapper.selectByPrimaryKey(481440971);
        System.out.println(ulogin);
    }


    @Test
    public void fun1(){

    }

    @Test
    public void fun11(){

    }

    @Test
    public void fun12(){

    }

    @Test
    public void fun13(){

    }

    @Test
    public void fun14(){

    }
}
