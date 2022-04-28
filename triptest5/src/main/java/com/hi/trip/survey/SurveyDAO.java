package com.hi.trip.survey;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SurveyDAO implements SurveyDAOInter {

	@Autowired
	SqlSessionTemplate my; //의존성주입(DI)
	
	@Override
	public List<SurveyVO> surveyList() {
		return my.selectList("survey.list");
	}
//	public SurveyVO surveyReadOne(SurveyVO vo) {
//		return my.selectOne("survey.readOne", vo);
//	}
	@Override
	public int surveyDelete(SurveyVO vo) {
			return my.delete("survey.delete", vo); 
	}
	@Override
	public int surveyCreate(SurveyVO vo) {
		return my.insert("survey.create", vo);
	}
	@Override
	public int surveyUpdate(SurveyVO vo) {
		return my.update("survey.update", vo);
	}
}
