package online.wenmeng.controler;

import online.wenmeng.service.UInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class UInfoController {

    @Autowired
    private UInfoService uInfoService;

    /**
     * 设置用户信息
     * 没有可为 null
     *      例如：updateUserInfo/null/null/null/212***121
     */
    @RequestMapping("updateUserInfo/{phone}/{email:.*}/{WeChat}/{QQNum}")
    public Map<String,Object> updateUserInfo(HttpSession httpSession, @PathVariable("phone") String phone, @PathVariable("email") String email, @PathVariable("WeChat") String WeChat, @PathVariable("QQNum") String QQNum){
        return uInfoService.updateUserInfo( httpSession, phone, email, WeChat, QQNum);
    }
}
