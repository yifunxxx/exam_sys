package cn.xsaf1207.exam.domain;

public class ErrorQuestion {
    private Integer eqId;

    private Integer tpId;

    private String uId;

    private String eqType;

    private String eqAnswer;

    public Integer getEqId() {
        return eqId;
    }

    public void setEqId(Integer eqId) {
        this.eqId = eqId;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getEqType() {
        return eqType;
    }

    public void setEqType(String eqType) {
        this.eqType = eqType == null ? null : eqType.trim();
    }

    public String getEqAnswer() {
        return eqAnswer;
    }

    public void setEqAnswer(String eqAnswer) {
        this.eqAnswer = eqAnswer == null ? null : eqAnswer.trim();
    }
}