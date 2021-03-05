package online.wenmeng.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/14 23:09
 * @Descrintion: static静态资源
 * @version: 1.0
 */
public class Config {

    //接收意见反馈的邮箱
    public static String ReceiveMailNum = "15518064076@163.com";
    //保存服务信息
    public static Map<Integer,Integer> sendEmailCountMap = new HashMap<>();
    //控制每个用户提交意见的次数
    public static int numberOfFeedback = 3;
    /**
     * 数据库使用
     */
    public static String splitUsers = ",";
    public static int carpoolinginfo_ing = 0;//还在拼车中
    public static int carpoolinginfo_complete = 1;//拼车完成，还不算完结
    public static int carpoolinginfo_end = 2;//拼车完结，处于历史数据


    //出现错误，很有可能是未知错误
    public static String ERROR = "error";
    //请求数据成功
    public static String SUCCESS = "success";
    //重试
    public static String RETRY = "retry";
    //用户的登录页面
    public static String LOGIN = "login";
    //跳转到主页
    public static String INDEX = "index";


    /**
     * 返回参数定义
     */
    public static String STATE = "state";//请求的状态    success error
    public static String ACTION = "action";//后台希望的的响应动作 null index login
    public static String MSG = "msg";//附加的消息 null
    public static String DATA = "data";//数据内容 null


    /**
     * 后台使用参数
     */
    //用户保存在session中的openID
    public static String Openid = "openid";
    //用户的昵称
    public static String NickName = "nickName";
    //用户的性别
    public static String Gender = "gender";
    //用户头像信息
    public static String ChatHead = "chatHead";
    //用户登录时保存在session中的登录的QQ信息
    public static String userInfoInRun = "userInfoInRun";

    //程序中对日期的格式化
    public static String patternDate = "yyyy-MM-dd HH:mm:ss";

}
