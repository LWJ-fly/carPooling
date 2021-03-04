package online.wenmeng.service;

import online.wenmeng.bean.Carpoolinginfo;
import online.wenmeng.bean.CarpoolinginfoExample;
import online.wenmeng.bean.Uinacarinfo;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CarpoolinginfoMapper;
import online.wenmeng.exception.ParameterError;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 拼车信息控制器
 */
@Service
public class CarPoolingServices {

    @Autowired
    private CarpoolinginfoMapper carpoolinginfoMapper;


    /**
     * 查询当前所有的拼车信息，正在拼车的信息
     * @return
     */
    public Map<String, Object> findAllCarPooling() {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andStateEqualTo(1);
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    public Map<String, Object> findCarPoolingByOrigin(String origin) {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andReadyplaceEqualTo(origin);
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    public Map<String, Object> findCarPoolingByLikeOrigin(String origin) {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andReadyplaceLike(origin);
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }


    public Map<String, Object> findCarPoolingByBourn(String bourn) {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andGoplaceEqualTo(bourn);
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    public Map<String, Object> findCarPoolingByLikeBourn(String bourn) {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andGoplaceLike(bourn);
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }


    public Map<String, Object> findCarPoolingByTrip(String origin, String bourn) {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andReadyplaceEqualTo(origin);
        criteria.andGoplaceEqualTo(bourn);
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    public Map<String, Object> findCarPoolingByLikeTrip(String origin, String bourn) {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andReadyplaceLike(origin);
        criteria.andGoplaceLike(bourn);
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }


    public Map<String, Object> createCarPooling(HttpSession session, String origin, String bourn, String readyTime, String goTime, int totalNum, int getNum, String inCarMsg, String qqNum, String wxNum, String phoneNum, String email) throws ParameterError {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        //生成CarPoolingId
        int carPoolingId = 0;
        while (true){
            carPoolingId = MyUtils.getRandomNum();
            if (carpoolinginfoMapper.selectByPrimaryKey(carPoolingId)==null){
                break;
            }
        }
        Carpoolinginfo carpoolinginfo = null;
        try {
            //创建用户拼车信息
            carpoolinginfo = new Carpoolinginfo(carPoolingId,openId,null,getNum,totalNum,new Date(),null,new Date(readyTime),new Date(goTime),origin,bourn,null,1,null);
        } catch (Exception e) {
            throw new ParameterError();
        }
        int insert = carpoolinginfoMapper.insert(carpoolinginfo);
        if (insert>0){//插入成功
            //同步自己的拼车信息
            UinACarService uinACarService = new UinACarService();
            Uinacarinfo uinacarinfo = uinACarService.insertUinacar(carPoolingId, openId, inCarMsg, qqNum, wxNum, phoneNum, email);
            if (uinacarinfo!=null){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfo);
            }
        }
        throw new ParameterError();
    }


    public Map<String, Object> joinCarPooling(HttpSession session, int carId, String inCarMsg, String qqNum, String wxNum, String phoneNum, String email) throws ParameterError {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        Carpoolinginfo carpoolinginfo = carpoolinginfoMapper.selectByPrimaryKey(carId);
        if (carpoolinginfo!=null&&carpoolinginfo.getState()==1&&!carpoolinginfo.getUserids().contains(openId+"")){//传入的信息正确
            //更新拼车人数
            carpoolinginfo.setGetnum(carpoolinginfo.getGetnum()-1);
            if (carpoolinginfo.getUserids()!=null&&carpoolinginfo.getUserids().trim().length()>0){
                carpoolinginfo.setUserids(carpoolinginfo.getUserids()+Config.splitUsers+openId);
            }else {
                carpoolinginfo.setUserids(""+openId);
            }
            int i = carpoolinginfoMapper.updateByPrimaryKeySelective(carpoolinginfo);
            if (i>0){
                //同步自己的拼车信息
                UinACarService uinACarService = new UinACarService();
                Uinacarinfo uinacarinfo = uinACarService.insertUinacar(carpoolinginfo.getCarid(), openId, inCarMsg, qqNum, wxNum, phoneNum, email);
                if (uinacarinfo!=null){
                    return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfo);
                }
            }
        }
        throw new ParameterError();
    }
}
