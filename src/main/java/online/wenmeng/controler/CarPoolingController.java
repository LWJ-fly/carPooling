package online.wenmeng.controler;

import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.CarPoolingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 拼车信息控制器，管理拼车信息
 */
@RestController
public class CarPoolingController {

    @Autowired
    CarPoolingServices carPoolingServices;

    /**
     * 查询所有的拼车信息，只返回条数后台进行设置
     * @return
     */
    @RequestMapping("findAllCarPooling")
    public Map<String,Object> findAllCarPooling(){
        return carPoolingServices.findAllCarPooling();
    }

    /**
     * 通过出发地搜索拼车信息————精确查询
     * @return
     */
    @RequestMapping("findCarPoolingByOrigin/{origin}")
    public Map<String,Object> findCarPoolingByOrigin(@PathVariable("origin") String origin){
        return carPoolingServices.findCarPoolingByOrigin(origin);
    }
    /**
     * 通过出发地搜索拼车信息————模糊查询
     * @return
     */
    @RequestMapping("findCarPoolingByLikeOrigin/{origin}")
    public Map<String,Object> findCarPoolingByLikeOrigin(@PathVariable("origin") String origin){
        return carPoolingServices.findCarPoolingByLikeOrigin(origin);
    }

    /**
     * 通过目的地搜索拼车信息————不需要登录
     *                                  【精确查询】
     * @return
     */
    @RequestMapping("findCarPoolingByBourn/{bourn}")
    public Map<String,Object> findCarPoolingByBourn(@PathVariable("bourn") String bourn){
        return carPoolingServices.findCarPoolingByBourn(bourn);
    }

    /**
     * 通过目的地搜索拼车信息————不需要登录
     *                                  【模糊查询】
     * @return
     */
    @RequestMapping("findCarPoolingByLikeBourn/{bourn}")
    public Map<String,Object> findCarPoolingByLikeBourn(@PathVariable("bourn") String bourn){
        return carPoolingServices.findCarPoolingByLikeBourn(bourn);
    }


    /**
     * 通过出发地和目的地搜索拼车信息————不需要登录
     *                                  【精确查询】
     * @return
     */
    @RequestMapping("findCarPoolingByTrip/{origin}/{bourn}")
    public Map<String,Object> findCarPoolingByTrip(@PathVariable("origin") String origin,@PathVariable("bourn") String bourn){
        return carPoolingServices.findCarPoolingByTrip(origin,bourn);
    }


    /**
     * 通过出发地和目的地搜索拼车信息————不需要登录
     *                                  【模糊查询】
     * @return
     */
    @RequestMapping("findCarPoolingByLikeTrip/{origin}/{bourn}")
    public Map<String,Object> findCarPoolingByLikeTrip(@PathVariable("origin") String origin,@PathVariable("bourn") String bourn){
        return carPoolingServices.findCarPoolingByLikeTrip(origin,bourn);
    }

    /**
     * 发起拼车 填写发起拼车信息
     * @param origin 出发地
     * @param bourn 目的地
     * @param readyTime 最早出发时间
     * @param GoTime    最晚出发时间
     * @param totalNum  拼车总人数
     * @param getNum    需要拼车的人数
     * @param inCarMsg  车主在拼车中的留言——为空则为null
     * @param QQNum     QQ号——为空则为null
     * @param WXNum     微信号——为空则为null
     * @param phoneNum  手机号——为空则为null
     * @param email 拼车结果通知邮箱——为空则为null
     * @return 返回拼车状态
     */
    @RequestMapping("createCarPooling/{origin}/{bourn}/{readyTime}/{GoTime}/{totalNum}/{getNum}/{inCarMsg:.*}/{QQNum}/{WXNum:.*}/{phoneNum}/{email:.*}")
    public Map<String,Object> createCarPooling(HttpSession session,@PathVariable("origin") String origin,@PathVariable("bourn") String bourn,@PathVariable("readyTime") long readyTime,@PathVariable("GoTime") long GoTime,@PathVariable("totalNum") int totalNum,@PathVariable("getNum") int getNum,@PathVariable("inCarMsg") String inCarMsg,@PathVariable("QQNum") String QQNum,@PathVariable("WXNum") String WXNum,@PathVariable("phoneNum") String phoneNum,@PathVariable("email") String email) throws ParameterErrorException {
        return carPoolingServices.createCarPooling(session, origin, bourn, readyTime, GoTime, totalNum, getNum, inCarMsg, QQNum, WXNum, phoneNum, email);
    }

    /**
     * 加入拼车 填写加入拼车的信息
     * @param inCarMsg  在拼车中的留言——为空则为null
     * @param QQNum     QQ号——为空则为null
     * @param WXNum     微信号——为空则为null
     * @param phoneNum  手机号——为空则为null
     * @param email 拼车结果通知邮箱——为空则为null
     * @return 返回拼车状态
     */
    @RequestMapping("joinCarPooling/{carId}/{inCarMsg:.*}/{QQNum}/{WXNum:.*}/{phoneNum}/{email:.*}")
    public Map<String,Object> joinCarPooling(HttpSession session,@PathVariable("carId") int carId,@PathVariable("inCarMsg") String inCarMsg,@PathVariable("QQNum") String QQNum,@PathVariable("WXNum") String WXNum,@PathVariable("phoneNum") String phoneNum,@PathVariable("email") String email) throws ParameterErrorException {
        return carPoolingServices.joinCarPooling(session,carId,inCarMsg,QQNum,WXNum,phoneNum,email);
    }

    /**
     * 查看详细拼车信息
     *      ————如果没有加入拼车，相应信息会进行保密处理
     *      ————如果加入拼车，相应信息会进行展示
     * @param carId
     * @return
     */
    @RequestMapping("findDetailCarPooling/{carId}")
    public Map<String,Object> findMyDetailCarPooling(HttpSession session,@PathVariable("carId") int carId){
        return carPoolingServices.findMyDetailCarPooling( session, carId);
    }

    /**
     * 退出拼车
     * @param carId
     * @return
     */
    @RequestMapping("quitCarPooling/{carId}")
    public Map<String,Object> quitCarPooling(HttpSession session,@PathVariable("carId") int carId) throws ParameterErrorException {
        return carPoolingServices.quitCarPooling(session,carId);
    }


}
