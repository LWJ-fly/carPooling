package online.wenmeng.controler;

import online.wenmeng.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/19 0:15
 * @Descrintion:
 * @version: 1.0
 */
@RestController
public class UserControler {

    @Autowired
    private UserServices userServices;

    /**
     * 用户登录调用
     * @param session 服务器获取
     * @param code 用户传输的QQ登录码
     * @return 返回用户登录信息(昵称，性别，头像链接)
     *              如果错误会给出错误信息
     *                  一般是code错误
     *                  也会有限制用户登录、当前用户被禁用
     */
    @RequestMapping("/login/{code}")
    public Map<String,Object> getUser(HttpSession session, @PathVariable("code") String code){
        return userServices.getUser(session, code);
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/exit")
    public Map<String,Object> exit(HttpSession session){
        return userServices.exit(session);
    }

}
