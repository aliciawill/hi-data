package com.hi.trip.survey;

import java.util.List;

public interface SurveyDAOInter {

	List<SurveyVO> surveyList();

	//	public SurveyVO surveyReadOne(SurveyVO vo) {
	//		return my.selectOne("survey.readOne", vo);
	//	}
	int surveyDelete(SurveyVO vo);

	int surveyCreate(SurveyVO vo);

	int surveyUpdate(SurveyVO vo);

}