package online.wenmeng.service;

import online.wenmeng.bean.Carpoolinginfo;
import online.wenmeng.bean.CarpoolinginfoExample;
import online.wenmeng.bean.Uinacarinfo;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CarpoolinginfoMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.TransitionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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

    @Autowired
    private UinACarService uinACarService;

    /**
     * 查询当前所有的拼车信息，正在拼车的信息
     * @return
     */
    public Map<String, Object> findAllCarPooling() {
        CarpoolinginfoExample carpoolinginfoExample = new CarpoolinginfoExample();
        CarpoolinginfoExample.Criteria criteria = carpoolinginfoExample.createCriteria();
        criteria.andCarpoolingstateEqualTo(1);
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
        criteria.andReadyplaceLike("%"+origin+"%");
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
        criteria.andGoplaceLike("%"+bourn+"%");
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
        criteria.andReadyplaceLike("%"+origin+"%");
        criteria.andGoplaceLike("%"+bourn+"%");
        List<Carpoolinginfo> carpoolinginfos = carpoolinginfoMapper.selectByExample(carpoolinginfoExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }


    public Map<String, Object> createCarPooling(HttpSession session, String origin, String bourn, long readyTime, long goTime, int totalNum, int getNum, String inCarMsg, String qqNum, String wxNum, String phoneNum, String email) throws ParameterErrorException {
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
        //创建用户拼车信息
        carpoolinginfo = new Carpoolinginfo(carPoolingId,openId,null,getNum,totalNum,new Date(),null,new Date(readyTime),new Date(goTime),origin,bourn,null,1,null);
        int insert = carpoolinginfoMapper.insert(carpoolinginfo);
        if (insert>0){//插入成功
            //同步自己的拼车信息
            Uinacarinfo uinacarinfo = uinACarService.insertUinacar(carPoolingId, openId, inCarMsg, qqNum, wxNum, phoneNum, email);
            if (uinacarinfo!=null){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,findAllCarPooling());
            }
        }
        throw new ParameterErrorException();
    }


    public Map<String, Object> joinCarPooling(HttpSession session, int carId, String inCarMsg, String qqNum, String wxNum, String phoneNum, String email) throws ParameterErrorException {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        Carpoolinginfo carpoolinginfo = carpoolinginfoMapper.selectByPrimaryKey(carId);
        if (carpoolinginfo!=null&&carpoolinginfo.getCarpoolingstate()==1&&!carpoolinginfo.getUserids().contains(openId+"")){//传入的信息正确
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
                Uinacarinfo uinacarinfo = uinACarService.insertUinacar(carpoolinginfo.getCarid(), openId, inCarMsg, qqNum, wxNum, phoneNum, email);
                if (uinacarinfo!=null){
                    return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfo);
                }
            }
        }
        throw new ParameterErrorException();
    }


    /**
     * 通过拼车ID获取拼车信息
     * @param carid 拼车的ID
     * @return
     */
    public Carpoolinginfo getCarPoolingInfoByCarId(int carid){
        return carpoolinginfoMapper.selectByPrimaryKey(carid);
    }

    public Map<String, Object> findMyDetailCarPooling(HttpSession session, int carId) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        //获取到拼车信息
        Carpoolinginfo carpoolinginfo = carpoolinginfoMapper.selectByPrimaryKey(carId);
        //获取到所有的拼车信息
        List<Uinacarinfo> uinacarinfoList = new ArrayList<>();
        //发起拼车人的信息
        uinacarinfoList.add(uinACarService.getUinacarinfoByCarIdAndUserId(carpoolinginfo.getCarid(),carpoolinginfo.getUserid()));
        String[] userIds = carpoolinginfo.getUserids().split(Config.splitUsers);
        for (String userId:userIds) {
            uinacarinfoList.add(uinACarService.getUinacarinfoByCarIdAndUserId(carpoolinginfo.getCarid(), TransitionUtil.transitionType(userId.trim(),int.class)));
        }
        if (!carpoolinginfo.getUserid().equals(openId)&&!carpoolinginfo.getUserids().contains(""+openId)||carpoolinginfo.getCarpoolingstate().equals(Config.carpoolinginfo_end)){//如果不是拼车内的成员,必要信息进行打码处理
            return MyUtils.getNewMap(Config.SUCCESS,null,carpoolinginfo.toString(),uinACarService.hideUinaCarInfo(uinacarinfoList));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,carpoolinginfo.toString(),uinacarinfoList);
    }


    public Map<String, Object> quitCarPooling(HttpSession session, int carId) throws ParameterErrorException {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        //获取到拼车信息
        Carpoolinginfo carpoolinginfo = carpoolinginfoMapper.selectByPrimaryKey(carId);
        //获取到所有的拼车Id
        List<Integer> userIdsList = new ArrayList<>();
        userIdsList.add(TransitionUtil.transitionType(carpoolinginfo.getUserid(),int.class));
        String[] userIds = carpoolinginfo.getUserids().split(Config.splitUsers);
        for (String str:userIds) {
            userIdsList.add(TransitionUtil.transitionType(str.trim(),int.class));
        }

        if (userIdsList.contains(openId)&&carpoolinginfo.getCarpoolingstate().equals(Config.carpoolinginfo_ing)){//加入拼车了，但是没有拼车完成
            carpoolinginfo.setGetnum(carpoolinginfo.getGetnum()+1);
            //将此人移动到历史人物
            String leavenum = carpoolinginfo.getLeavenum();
            leavenum = leavenum!=null&&leavenum.trim().length()>4?leavenum+Config.splitUsers+openId:openId+"";
            carpoolinginfo.setLeavenum(leavenum);
            if (carpoolinginfo.getUserid().equals(openId)){//如果退出拼车的是发起拼车的
                userIdsList.remove(openId);
                if (userIdsList.size()>0){
                    carpoolinginfo.setUserid(userIdsList.get(0));
                }else {
                    //只剩一个人，改变拼车状态，并将此人移动到历史人员，并更新自己的信息
                    carpoolinginfo.setUserid(null);
                    carpoolinginfo.setCarpoolingstate(Config.carpoolinginfo_end);
                    carpoolinginfo.setEndtime(new Date());
                }
            }else {
                userIdsList.remove(openId);
                userIdsList.remove(carpoolinginfo.getUserid());
                String userId =null;
                for (int userid:userIdsList) {
                    if (userId!=null){
                        userId = userid+"";
                    }else {
                        userId = Config.splitUsers+userid;
                    }
                }
                carpoolinginfo.setUserids(userId);
            }
            int i = carpoolinginfoMapper.updateByPrimaryKey(carpoolinginfo);
            if (i>0){
                //更新自己的信息
                Boolean aBoolean = uinACarService.setUinacarinfo2LeaveByCarIdAndUserId(carpoolinginfo.getCarid(), openId);
                if (aBoolean){
                    return MyUtils.getNewMap(Config.SUCCESS,Config.RETRY,null,carpoolinginfo);
                }
            }
        }
        throw new ParameterErrorException();
    }
}
