package cn.xsaf1207.sys.domain;

public class Role {
    private Integer rId;

    private String rName;

    private String rDesc;

    private String rAvaiable;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc == null ? null : rDesc.trim();
    }

    public String getrAvaiable() {
        return rAvaiable;
    }

    public void setrAvaiable(String rAvaiable) {
        this.rAvaiable = rAvaiable == null ? null : rAvaiable.trim();
    }
}