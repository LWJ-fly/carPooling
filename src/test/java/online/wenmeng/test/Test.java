package online.wenmeng.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import online.wenmeng.utils.HttpsRequest;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/6 9:58
 * @Descrintion:
 * @version: 1.0
 */

public class Test {

    public static int val(){
        int num =5;
        try {
            num = num/0;
        } catch (Exception e) {
            num = 10;
        } finally {
            num = 15;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(val());
    }

    @org.junit.Test
    public void fun1(){
        String s = "{\"ret\":0,\"msg\":\"\",\"is_lost\":0,\"gender\":\"男\",\"is_yellow_vip\":\"0\",\"city\":\"周口\",\"year\":\"1997\",\"level\":\"0\",\"openid\":39477477,\"figureurl_2\":\"http://thirdqq.qlogo.cn/qqopen/f96SOdjXyEH1TjGzXGTRCibPvXeic6Vtg8IG8G0jXMjwf088icqgOGXCw7jHseMqIEC/100?v=8eff\",\"figureurl_1\":\"http://thirdqq.qlogo.cn/qqopen/f96SOdjXyEH1TjGzXGTRCibPvXeic6Vtg8IG8G0jXMjwf088icqgOGXCw7jHseMqIEC/40?v=8eff\",\"gender_type\":1,\"is_yellow_year_vip\":\"0\",\"province\":\"河南\",\"constellation\":\"\",\"figureurl\":\"http://thirdqq.qlogo.cn/qqopen/f96SOdjXyEH1TjGzXGTRCibPvXeic6Vtg8IG8G0jXMjwf088icqgOGXCw7jHseMqIEC/40?v=8eff\",\"figureurl_type\":\"1\",\"figureurl_qq\":\"http://thirdqq.qlogo.cn/qqopen/f96SOdjXyEH1TjGzXGTRCibPvXeic6Vtg8IG8G0jXMjwf088icqgOGXCw7jHseMqIEC/100?v=8eff\",\"nickname\":\"火狐狸\",\"yellow_vip_level\":\"0\",\"figureurl_qq_1\":\"http://thirdqq.qlogo.cn/qqopen/f96SOdjXyEH1TjGzXGTRCibPvXeic6Vtg8IG8G0jXMjwf088icqgOGXCw7jHseMqIEC/40?v=8eff\",\"vip\":\"0\",\"figureurl_qq_2\":\"http://thirdqq.qlogo.cn/qqopen/f96SOdjXyEH1TjGzXGTRCibPvXeic6Vtg8IG8G0jXMjwf088icqgOGXCw7jHseMqIEC/100?v=8eff\"}";
        JSONObject jsonObject = JSON.parseObject(s);
        System.out.println(jsonObject.getString("gender"));
    }

    @org.junit.Test
    public void fun(){
        String request = HttpsRequest.httpsRequest("https://wenmeng.online/api/changeUserInfo/123456/EF23F82663012829AD2C498DD84A996C", "GET", null);
        JSONObject json = JSON.parseObject(request);
        System.out.println(json);
    }
}
