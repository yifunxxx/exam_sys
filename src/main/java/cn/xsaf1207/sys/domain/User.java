package cn.xsaf1207.sys.domain;

import java.util.Date;

public class User {
    private String uId;

    private Integer csId;

    private String uName;

    private String uPwd;

    private String uSex;

    private String uPhone;

    private Date uCreatime;

    private String uAvaiable;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        this.csId = csId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public Date getuCreatime() {
        return uCreatime;
    }

    public void setuCreatime(Date uCreatime) {
        this.uCreatime = uCreatime;
    }

    public String getuAvaiable() {
        return uAvaiable;
    }

    public void setuAvaiable(String uAvaiable) {
        this.uAvaiable = uAvaiable == null ? null : uAvaiable.trim();
    }
}