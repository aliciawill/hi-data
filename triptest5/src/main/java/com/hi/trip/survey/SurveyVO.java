package com.hi.trip.survey;

public class SurveyVO {
	private int survey_idx;
	private String survey_question;
	private String survey_choices;
	
	public int getSurvey_idx() {
		return survey_idx;
	}
	public void setSurvey_idx(int survey_idx) {
		this.survey_idx = survey_idx;
	}
	public String getSurvey_question() {
		return survey_question;
	}
	public void setSurvey_question(String survey_question) {
		this.survey_question = survey_question;
	}
	public String getSurvey_choices() {
		return survey_choices;
	}
	public void setSurvey_choices(String survey_choices) {
		this.survey_choices = survey_choices;
	}
	@Override
	public String toString() {
		return "SurveyController [survey_idx=" + survey_idx + ", survey_question=" + survey_question
				+ ", survey_choices=" + survey_choices + "]";
	}
}
