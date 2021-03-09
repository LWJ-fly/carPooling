package online.wenmeng.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import online.wenmeng.utils.HttpsRequest;

import java.util.Date;

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
    @org.junit.Test
    public void fun11(){
        String str = "15518064076";
        String s = hideStrProcessing(str);
        System.out.println(new Date().getTime());
    }
    @org.junit.Test
    public void fun111(){
        int i = 0;
        int ii = 0;
        Integer j = 0;
        Integer jj = 0;
        System.out.println(i==ii);
        System.out.println(j==jj);
        System.out.println(j==i);
        System.out.println(i==j);
        System.out.println(j.equals(jj));
        System.out.println(j.equals(i));
    }

    public String hideStrProcessing(String str){
        return str.substring(0,3)+"****"+str.substring(str.length()-3,str.length());
    }
}
