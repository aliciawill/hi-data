package com.hi.trip.surveyResult;

import java.sql.Timestamp;

public class SurveyResultVO {
	private int surveyResult_idx;
	private int member_idx;
	private Timestamp surveyResult_date;
	private String surveyResult_recommendation;
	private String surveyResult_answers;
	private int survey_idx;
	
	@Override
	public String toString() {
		return "SurveyResultVO [surveyResult_idx=" + surveyResult_idx + ", member_idx=" + member_idx
				+ ", surveyResult_date=" + surveyResult_date + ", surveyResult_recommendation="
				+ surveyResult_recommendation + ", surveyResult_answers=" + surveyResult_answers + ", survey_idx="
				+ survey_idx + "]";
	}
	public int getSurveyResult_idx() {
		return surveyResult_idx;
	}
	public void setSurveyResult_idx(int surveyResult_idx) {
		this.surveyResult_idx = surveyResult_idx;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public Timestamp getSurveyResult_date() {
		return surveyResult_date;
	}
	public void setSurveyResult_date(Timestamp surveyResult_date) {
		this.surveyResult_date = surveyResult_date;
	}
	public String getSurveyResult_recommendation() {
		return surveyResult_recommendation;
	}
	public void setSurveyResult_recommendation(String surveyResult_recommendation) {
		this.surveyResult_recommendation = surveyResult_recommendation;
	}
	public String getSurveyResult_answers() {
		return surveyResult_answers;
	}
	public void setSurveyResult_answers(String surveyResult_answers) {
		this.surveyResult_answers = surveyResult_answers;
	}
	public int getSurvey_idx() {
		return survey_idx;
	}
	public void setSurvey_idx(int survey_idx) {
		this.survey_idx = survey_idx;
	}
}
