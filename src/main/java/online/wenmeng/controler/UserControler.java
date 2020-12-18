package online.wenmeng.controler;

import online.wenmeng.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/19 0:15
 * @Descrintion:
 * @version: 1.0
 */
@Controller
public class UserControler {

    @Autowired
    private UserServices userServices;

    @ResponseBody
    @RequestMapping("/getuser")
    public String getUser(int id){
        System.out.println(id);
        return userServices.getUser(id);
    }
}
