package online.wenmeng.test;

import online.wenmeng.controler.UserControler;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/6 9:58
 * @Descrintion:
 * @version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext*")
public class Test {

    @Autowired
    private UserControler userControler;


    public void fun(){
        String user = userControler.getUser(1);
        System.out.println(user);
    }
}
