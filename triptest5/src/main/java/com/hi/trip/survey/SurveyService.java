package com.hi.trip.survey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 


@Service
public class SurveyService{

	@Autowired
	SurveyDAOInter surveyDao;
	public List<Object> listService() {
		List<SurveyVO> surveyList = surveyDao.surveyList();				 //db Survey 테이블에서 VO 받아옴
		ArrayList<String>  surveyChoices= new ArrayList<String>(); // survey_choices를 splt하여 담을 Arraylist
		for(int i = 0; i < surveyList.size(); i++) { //choices split하여 저장
			String splitstr = surveyList.get(i).getSurvey_choices();
			surveyChoices.add(splitstr);
		}
		
		ArrayList<Object> surveyArrayList = new ArrayList<Object>(); // VO와 split list
		surveyArrayList.add(surveyList);
		surveyArrayList.add(surveyChoices);
		
//		List<List<SurveyVO>, ArrayList<String>> surveyCombinedList = Stream.of(surveyList, surveyChoices)
//                .flatMap(x -> x.stream())
//                .collect(Collectors.toList());
		
		return surveyArrayList;
			}
}
