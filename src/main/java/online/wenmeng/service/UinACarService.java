package online.wenmeng.service;

import online.wenmeng.bean.Carpoolinginfo;
import online.wenmeng.bean.Uinacarinfo;
import online.wenmeng.bean.UinacarinfoExample;
import online.wenmeng.bean.UinacarinfoKey;
import online.wenmeng.config.Config;
import online.wenmeng.dao.UinacarinfoMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/5 0:01
 * @Descrintion: 用户和拼车之间的关系
 * @version: 1.0
 */
@Service
public class UinACarService {

    @Autowired
    private UinacarinfoMapper uinacarinfoMapper;
    @Autowired
    private CarPoolingServices carPoolingServices;

    public Uinacarinfo insertUinacar(int carId,int userId,String inCarMsg,String qqNum,String wxNum,String phone,String email) throws ParameterErrorException {
        UinacarinfoKey uinacarinfoKey = new UinacarinfoKey();
        uinacarinfoKey.setCarid(carId);
        uinacarinfoKey.setUserid(userId);
        Uinacarinfo uinacarinfo_database = uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
        if (uinacarinfo_database==null){//没有插入过数据,进行插入
            Uinacarinfo uinacarinfo = new Uinacarinfo(inCarMsg,new Date(),0+"",0,qqNum,wxNum,phone,email);
            uinacarinfo.setCarid(carId);
            uinacarinfo.setUserid(userId);
            int i = uinacarinfoMapper.insert(uinacarinfo);
            if (i>0){
                return uinacarinfo;
            }
        }else {//更新数据
            if (!MyUtils.checkNull(inCarMsg)){
                uinacarinfo_database.setIncarmsg(inCarMsg);
            }
            if (!MyUtils.checkNull(qqNum)){
                uinacarinfo_database.setQqnum(qqNum);
            }
            if (!MyUtils.checkNull(wxNum)){
                uinacarinfo_database.setWxnum(wxNum);
            }
            if (!MyUtils.checkNull(phone)){
                uinacarinfo_database.setPhonenum(phone);
            }
            if (!MyUtils.checkNull(email)){
                uinacarinfo_database.setEmail(email);
            }
            int i = uinacarinfoMapper.updateByPrimaryKey(uinacarinfo_database);
            if (i>0){
                return uinacarinfo_database;
            }
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> findMyCarPooling(HttpSession session) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        UinacarinfoExample uinacarinfoExample = new UinacarinfoExample();
        uinacarinfoExample.createCriteria().andUseridEqualTo(openId).andCarstateEqualTo(0+"");
        List<Uinacarinfo> uinacarinfos = uinacarinfoMapper.selectByExample(uinacarinfoExample);
        //获取拼车的信息
        List<Carpoolinginfo> carpoolinginfos = new ArrayList<>();
        for (Uinacarinfo c :uinacarinfos) {
            carpoolinginfos.add(carPoolingServices.getCarPoolingInfoByCarId(c.getCarid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    public Map<String, Object> findMyAllCarPooling(HttpSession session) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        UinacarinfoExample uinacarinfoExample = new UinacarinfoExample();
        uinacarinfoExample.createCriteria().andUseridEqualTo(openId);
        List<Uinacarinfo> uinacarinfos = uinacarinfoMapper.selectByExample(uinacarinfoExample);
        //获取拼车的信息
        List<Carpoolinginfo> carpoolinginfos = new ArrayList<>();
        for (Uinacarinfo c :uinacarinfos) {
            carpoolinginfos.add(carPoolingServices.getCarPoolingInfoByCarId(c.getCarid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    /**
     * 通过主键获取用户拼车信息
     * @param carId 拼车信息的ID
     * @param userId 用户的ID
     * @return
     */
    public Uinacarinfo getUinacarinfoByCarIdAndUserId(int carId,int userId){
        UinacarinfoKey uinacarinfoKey = new Uinacarinfo();
        uinacarinfoKey.setCarid(carId);
        uinacarinfoKey.setUserid(userId);
        return uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
    }

    public Boolean setUinacarinfo2LeaveByCarIdAndUserId(int carId,int userId){
        Uinacarinfo uinacarinfo = getUinacarinfoByCarIdAndUserId(carId, userId);
        uinacarinfo.setCarstate("1");
        int i = uinacarinfoMapper.updateByPrimaryKey(uinacarinfo);
        return i>0;
    }

    public List<Uinacarinfo> hideUinaCarInfo(List<Uinacarinfo> uinacarinfoList){
        List<Uinacarinfo> hideUinacarinfoList = new ArrayList<>();
        for (Uinacarinfo uinacarinfo:uinacarinfoList) {
            hideUinacarinfoList.add(hideProcessing(uinacarinfo));
        }
        return hideUinacarinfoList;
    }

    public Uinacarinfo hideProcessing(Uinacarinfo uinacarinfo){
        uinacarinfo.setEmail(hideStrProcessing(uinacarinfo.getEmail()));
        uinacarinfo.setPhonenum(hideStrProcessing(uinacarinfo.getPhonenum()));
        uinacarinfo.setQqnum(hideStrProcessing(uinacarinfo.getQqnum()));
        uinacarinfo.setWxnum(hideStrProcessing(uinacarinfo.getWxnum()));
        return uinacarinfo;
    }

    public String hideStrProcessing(String str){
        return str.substring(0,3)+"****"+str.substring(str.length()-3,str.length());
    }

    public Map<String, Object> findHistoryCarPooling(HttpSession session) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        UinacarinfoExample uinacarinfoExample = new UinacarinfoExample();
        uinacarinfoExample.createCriteria().andUseridEqualTo(openId).andCarstateNotEqualTo(0+"");
        List<Uinacarinfo> uinacarinfos = uinacarinfoMapper.selectByExample(uinacarinfoExample);
        //获取拼车的信息
        List<Carpoolinginfo> carpoolinginfos = new ArrayList<>();
        for (Uinacarinfo c :uinacarinfos) {
            carpoolinginfos.add(carPoolingServices.getCarPoolingInfoByCarId(c.getCarid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }
}
