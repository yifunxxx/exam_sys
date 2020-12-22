package cn.xsaf1207.sys.domain;

public class Menu {
    private Integer muId;

    private Integer muPid;

    private String muName;

    private String muUrl;

    private String muIcon;

    private String muAvaiable;

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
    }

    public Integer getMuPid() {
        return muPid;
    }

    public void setMuPid(Integer muPid) {
        this.muPid = muPid;
    }

    public String getMuName() {
        return muName;
    }

    public void setMuName(String muName) {
        this.muName = muName == null ? null : muName.trim();
    }

    public String getMuUrl() {
        return muUrl;
    }

    public void setMuUrl(String muUrl) {
        this.muUrl = muUrl == null ? null : muUrl.trim();
    }

    public String getMuIcon() {
        return muIcon;
    }

    public void setMuIcon(String muIcon) {
        this.muIcon = muIcon == null ? null : muIcon.trim();
    }

    public String getMuAvaiable() {
        return muAvaiable;
    }

    public void setMuAvaiable(String muAvaiable) {
        this.muAvaiable = muAvaiable == null ? null : muAvaiable.trim();
    }
}