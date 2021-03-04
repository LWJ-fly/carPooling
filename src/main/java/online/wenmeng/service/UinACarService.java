package online.wenmeng.service;

import online.wenmeng.bean.Uinacarinfo;
import online.wenmeng.bean.UinacarinfoKey;
import online.wenmeng.dao.UinacarinfoMapper;
import online.wenmeng.exception.ParameterError;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/5 0:01
 * @Descrintion: 用户和拼车之间的关系
 * @version: 1.0
 */
public class UinACarService {

    @Autowired
    private UinacarinfoMapper uinacarinfoMapper;

    public Uinacarinfo insertUinacar(int carId,int userId,String inCarMsg,String qqNum,String wxNum,String phone,String email) throws ParameterError {
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
        throw new ParameterError();
    }
}
