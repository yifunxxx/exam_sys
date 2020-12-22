package cn.xsaf1207.exam.domain;

public class FillblankQuestion {
    private Integer fbqId;

    private Integer tpId;

    private String fbqContent;

    private String fbqAnswer;

    private String fbqScore;

    public Integer getFbqId() {
        return fbqId;
    }

    public void setFbqId(Integer fbqId) {
        this.fbqId = fbqId;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getFbqContent() {
        return fbqContent;
    }

    public void setFbqContent(String fbqContent) {
        this.fbqContent = fbqContent == null ? null : fbqContent.trim();
    }

    public String getFbqAnswer() {
        return fbqAnswer;
    }

    public void setFbqAnswer(String fbqAnswer) {
        this.fbqAnswer = fbqAnswer == null ? null : fbqAnswer.trim();
    }

    public String getFbqScore() {
        return fbqScore;
    }

    public void setFbqScore(String fbqScore) {
        this.fbqScore = fbqScore == null ? null : fbqScore.trim();
    }
}