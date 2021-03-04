package online.wenmeng.bean;

import online.wenmeng.config.Config;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Carpoolinginfo {
    private Integer carid;

    private Integer userid;

    private String userids;

    private Integer getnum;

    private Integer totalnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date starttime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date readytime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gotime;

    private String readyplace;

    private String goplace;

    private Integer limit;

    private Integer state;

    private String leavenum;

    public Carpoolinginfo() {
    }

    public Carpoolinginfo(Integer carid, Integer userid, String userids, Integer getnum, Integer totalnum, Date starttime, Date endtime, Date readytime, Date gotime, String readyplace, String goplace, Integer limit, Integer state, String leavenum) {
        this.carid = carid;
        this.userid = userid;
        this.userids = userids;
        this.getnum = getnum;
        this.totalnum = totalnum;
        this.starttime = starttime;
        this.endtime = endtime;
        this.readytime = readytime;
        this.gotime = gotime;
        this.readyplace = readyplace;
        this.goplace = goplace;
        this.limit = limit;
        this.state = state;
        this.leavenum = leavenum;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserids() {
        return userids;
    }

    public void setUserids(String userids) {
        this.userids = userids == null ? null : userids.trim();
    }

    public Integer getGetnum() {
        return getnum;
    }

    public void setGetnum(Integer getnum) {
        this.getnum = getnum;
    }

    public Integer getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getReadytime() {
        return readytime;
    }

    public void setReadytime(Date readytime) {
        this.readytime = readytime;
    }

    public Date getGotime() {
        return gotime;
    }

    public void setGotime(Date gotime) {
        this.gotime = gotime;
    }

    public String getReadyplace() {
        return readyplace;
    }

    public void setReadyplace(String readyplace) {
        this.readyplace = readyplace == null ? null : readyplace.trim();
    }

    public String getGoplace() {
        return goplace;
    }

    public void setGoplace(String goplace) {
        this.goplace = goplace == null ? null : goplace.trim();
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getLeavenum() {
        return leavenum;
    }

    public void setLeavenum(String leavenum) {
        this.leavenum = leavenum == null ? null : leavenum.trim();
    }
}