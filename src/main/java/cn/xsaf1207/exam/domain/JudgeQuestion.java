package cn.xsaf1207.exam.domain;

public class JudgeQuestion {
    private Integer jqId;

    private Integer tpId;

    private String jqContent;

    private String jqAnswer;

    private String jqSocre;

    public Integer getJqId() {
        return jqId;
    }

    public void setJqId(Integer jqId) {
        this.jqId = jqId;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getJqContent() {
        return jqContent;
    }

    public void setJqContent(String jqContent) {
        this.jqContent = jqContent == null ? null : jqContent.trim();
    }

    public String getJqAnswer() {
        return jqAnswer;
    }

    public void setJqAnswer(String jqAnswer) {
        this.jqAnswer = jqAnswer == null ? null : jqAnswer.trim();
    }

    public String getJqSocre() {
        return jqSocre;
    }

    public void setJqSocre(String jqSocre) {
        this.jqSocre = jqSocre == null ? null : jqSocre.trim();
    }
}