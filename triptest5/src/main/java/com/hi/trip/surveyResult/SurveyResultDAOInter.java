package com.hi.trip.surveyResult;

import java.util.List;

public interface SurveyResultDAOInter {

	List<SurveyResultVO> surveyResultList(SurveyResultVO vo);

	SurveyResultVO surveyResultReadOne(SurveyResultVO vo);

	int surveyResultDelete(SurveyResultVO vo);

	int surveyResultCreate(SurveyResultVO vo);
	//	public int surveyResultUpdate(SurveyResultVO vo) {
	//		return my.update("surveyResult.update", vo);
	//	}

}