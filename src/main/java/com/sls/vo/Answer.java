package com.sls.vo;

import java.util.List;

public class Answer {
    private Integer answerId;

    private String answerUserId;

    private Integer paperId;

    private String answerScore;
    
    private List<AnswerDetail> answerDetail;
    

    @Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answerUserId=" + answerUserId + ", paperId=" + paperId
				+ ", answerScore=" + answerScore + ", answerDetail=" + answerDetail + "]";
	}

	public List<AnswerDetail> getAnswerDetail() {
		return answerDetail;
	}

	public void setAnswerDetail(List<AnswerDetail> answerDetail) {
		this.answerDetail = answerDetail;
	}

	public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswerUserId() {
        return answerUserId;
    }

    public void setAnswerUserId(String answerUserId) {
        this.answerUserId = answerUserId == null ? null : answerUserId.trim();
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getAnswerScore() {
        return answerScore;
    }

    public void setAnswerScore(String answerScore) {
        this.answerScore = answerScore == null ? null : answerScore.trim();
    }
}