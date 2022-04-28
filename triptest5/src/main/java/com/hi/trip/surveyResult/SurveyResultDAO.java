package com.hi.trip.surveyResult;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SurveyResultDAO implements SurveyResultDAOInter {

	@Autowired
	SqlSessionTemplate my; //의존성주입(DI)
	
	@Override
	public List<SurveyResultVO> surveyResultList(SurveyResultVO vo) {
		return my.selectList("surveyResult.list", vo);
	}
	@Override
	public SurveyResultVO surveyResultReadOne(SurveyResultVO vo) {
		return my.selectOne("surveyResult.readone", vo);
	}
	@Override
	public int surveyResultDelete(SurveyResultVO vo) {
			return my.delete("surveyResult.delete", vo); 
	}
	@Override
	public int surveyResultCreate(SurveyResultVO vo) {
		return my.insert("surveyResult.create", vo);
	}
//	public int surveyResultUpdate(SurveyResultVO vo) {
//		return my.update("surveyResult.update", vo);
//	}
}
