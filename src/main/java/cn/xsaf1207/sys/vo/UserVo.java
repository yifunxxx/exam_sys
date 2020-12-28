package cn.xsaf1207.sys.vo;

import cn.xsaf1207.sys.domain.User;

public class UserVo extends User {
    private String csName = "";
    private String uType = "";
    private Integer rId;

    @Override
    public String toString() {
        return "UserVo{" +
                "csName='" + csName + '\'' +
                ", uType='" + uType + '\'' +
                ", rId=" + rId +
                "} " + super.toString();
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }
}
