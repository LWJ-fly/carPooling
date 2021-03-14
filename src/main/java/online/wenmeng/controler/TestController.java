package online.wenmeng.controler;

import online.wenmeng.bean.user;
import online.wenmeng.config.Config;
import online.wenmeng.utils.MyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 2:24
 * @Descrintion:
 * @version: 1.0
 */
@RestController
public class TestController {

    @RequestMapping(value = "/demo",method = RequestMethod.POST)
    public Map<String,Object> test(String id , user user){
        return MyUtils.getNewMap(Config.SUCCESS,id,null,user.toString());
    }



}
