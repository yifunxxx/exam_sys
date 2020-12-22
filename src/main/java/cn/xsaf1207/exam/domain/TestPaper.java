package cn.xsaf1207.exam.domain;

import java.util.Date;

public class TestPaper {
    private Integer tpId;

    private Integer subId;

    private String uId;

    private String tpName;

    private String tpAvaiable;

    private Date tpCreatime;

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName == null ? null : tpName.trim();
    }

    public String getTpAvaiable() {
        return tpAvaiable;
    }

    public void setTpAvaiable(String tpAvaiable) {
        this.tpAvaiable = tpAvaiable == null ? null : tpAvaiable.trim();
    }

    public Date getTpCreatime() {
        return tpCreatime;
    }

    public void setTpCreatime(Date tpCreatime) {
        this.tpCreatime = tpCreatime;
    }
}