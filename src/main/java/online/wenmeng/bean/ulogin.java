package online.wenmeng.bean;

public class ulogin {
    private Integer userid;

    private Integer qqlogin;

    private String wxlogin;

    private String zfblogin;

    private String tblogin;

    private String zhlogin;

    private String zhpwd;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQqlogin() {
        return qqlogin;
    }

    public void setQqlogin(Integer qqlogin) {
        this.qqlogin = qqlogin;
    }

    public String getWxlogin() {
        return wxlogin;
    }

    public void setWxlogin(String wxlogin) {
        this.wxlogin = wxlogin == null ? null : wxlogin.trim();
    }

    public String getZfblogin() {
        return zfblogin;
    }

    public void setZfblogin(String zfblogin) {
        this.zfblogin = zfblogin == null ? null : zfblogin.trim();
    }

    public String getTblogin() {
        return tblogin;
    }

    public void setTblogin(String tblogin) {
        this.tblogin = tblogin == null ? null : tblogin.trim();
    }

    public String getZhlogin() {
        return zhlogin;
    }

    public void setZhlogin(String zhlogin) {
        this.zhlogin = zhlogin == null ? null : zhlogin.trim();
    }

    public String getZhpwd() {
        return zhpwd;
    }

    public void setZhpwd(String zhpwd) {
        this.zhpwd = zhpwd == null ? null : zhpwd.trim();
    }
}