package online.wenmeng.bean;

public class uinfo {
    private Integer userid;

    private String qqnum;

    private String wxnum;

    private String phonenum;

    private String tallmail;

    private String urealname;

    private String unickname;

    private Integer sex;

    private Integer outinfo;

    private String signature;

    private Double uwallet;

    private Integer ucredibility;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getTallmail() {
        return tallmail;
    }

    public void setTallmail(String tallmail) {
        this.tallmail = tallmail == null ? null : tallmail.trim();
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname == null ? null : urealname.trim();
    }

    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname == null ? null : unickname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getOutinfo() {
        return outinfo;
    }

    public void setOutinfo(Integer outinfo) {
        this.outinfo = outinfo;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Double getUwallet() {
        return uwallet;
    }

    public void setUwallet(Double uwallet) {
        this.uwallet = uwallet;
    }

    public Integer getUcredibility() {
        return ucredibility;
    }

    public void setUcredibility(Integer ucredibility) {
        this.ucredibility = ucredibility;
    }
}