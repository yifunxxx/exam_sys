package cn.xsaf1207.exam.domain;

public class SelectQuestion {
    private Integer sqId;

    private Integer tpId;

    private String sqContent;

    private String sqOption;

    private String sqAnswer;

    private String sqScore;

    public Integer getSqId() {
        return sqId;
    }

    public void setSqId(Integer sqId) {
        this.sqId = sqId;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getSqContent() {
        return sqContent;
    }

    public void setSqContent(String sqContent) {
        this.sqContent = sqContent == null ? null : sqContent.trim();
    }

    public String getSqOption() {
        return sqOption;
    }

    public void setSqOption(String sqOption) {
        this.sqOption = sqOption == null ? null : sqOption.trim();
    }

    public String getSqAnswer() {
        return sqAnswer;
    }

    public void setSqAnswer(String sqAnswer) {
        this.sqAnswer = sqAnswer == null ? null : sqAnswer.trim();
    }

    public String getSqScore() {
        return sqScore;
    }

    public void setSqScore(String sqScore) {
        this.sqScore = sqScore == null ? null : sqScore.trim();
    }
}