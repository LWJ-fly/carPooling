package online.wenmeng.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Uinacarinfo extends UinacarinfoKey {
    private String incarmsg;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date jointime;

    private String carstate;

    private Integer outinfo;

    private String qqnum;

    private String wxnum;

    private String phonenum;

    private String email;

    public Uinacarinfo(String incarmsg, Date jointime, String carstate, Integer outinfo, String qqnum, String wxnum, String phonenum, String email) {
        this.incarmsg = incarmsg;
        this.jointime = jointime;
        this.carstate = carstate;
        this.outinfo = outinfo;
        this.qqnum = qqnum;
        this.wxnum = wxnum;
        this.phonenum = phonenum;
        this.email = email;
    }

    public Uinacarinfo() {
    }

    public String getIncarmsg() {
        return incarmsg;
    }

    public void setIncarmsg(String incarmsg) {
        this.incarmsg = incarmsg == null ? null : incarmsg.trim();
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public String getCarstate() {
        return carstate;
    }

    public void setCarstate(String carstate) {
        this.carstate = carstate == null ? null : carstate.trim();
    }

    public Integer getOutinfo() {
        return outinfo;
    }

    public void setOutinfo(Integer outinfo) {
        this.outinfo = outinfo;
    }

    public String getQqnum() {
        return qqnum;
    }

    public void setQqnum(String qqnum) {
        this.qqnum = qqnum == null ? null : qqnum.trim();
    }

    public String getWxnum() {
        return wxnum;
    }

    public void setWxnum(String wxnum) {
        this.wxnum = wxnum == null ? null : wxnum.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}