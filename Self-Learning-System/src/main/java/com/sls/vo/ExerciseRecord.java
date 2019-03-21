package com.sls.vo;

import java.util.Date;

public class ExerciseRecord {
    private Integer recordId;

    private String recordUserId;

    private Integer quertionId;

    private String recordAnswer;

    private Integer recordType;

    private Date recordTime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordUserId() {
        return recordUserId;
    }

    public void setRecordUserId(String recordUserId) {
        this.recordUserId = recordUserId == null ? null : recordUserId.trim();
    }

    public Integer getQuertionId() {
        return quertionId;
    }

    public void setQuertionId(Integer quertionId) {
        this.quertionId = quertionId;
    }

    public String getRecordAnswer() {
        return recordAnswer;
    }

    public void setRecordAnswer(String recordAnswer) {
        this.recordAnswer = recordAnswer == null ? null : recordAnswer.trim();
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}