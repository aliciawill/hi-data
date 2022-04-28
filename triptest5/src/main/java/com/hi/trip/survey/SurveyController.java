package com.hi.trip.survey;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyController {
	@Autowired
	SurveyDAOInter surveyDao;
	
	@Autowired
	SurveyService surveyService;

	@RequestMapping("survey/surveyList")
	public void list(SurveyVO vo, Model model, HttpSession session) {
		
		List<SurveyVO> surveyList = surveyDao.surveyList(); // Dao에서 VO형태로 수신
//		List<List<String>>  surveyChoices= new ArrayList<List<String>>(); // split된 list를 담을 List<List<String>>
//		
//		for(int i = 0; i < surveyList.size(); i++) { //vo 한 줄 마다
//			List<String> choices = new ArrayList<String>(); // splitted String 저장할 list
//			String[] splitStr = surveyList.get(i).getSurvey_choices().split(","); //choices split하여 저장
//			for(int j=0; j<splitStr.length; j++){ 
//				choices.add(splitStr[j]);
//			}
//			
//			surveyChoices.add(choices);
//		}
//		for (int i=0; i < surveyCombinedList.size(); i++){
//			if(surveyCombinedList.get(i) instanceof SurveyVO){
//				surveyList.add((SurveyVO)surveyCombinedList.get(i));
//			}
//			else if(surveyCombinedList.get(i) instanceof String) {
//				surveyChoices.add((String)surveyCombinedList.get(i));
//			}
//		}
		System.out.println("surveyList:" + surveyList);
		
		model.addAttribute("surveyList", surveyList);
		session.setAttribute("member_idx", "1");
	}
	
	@RequestMapping("survey/surveyDelete")
	public void delete(SurveyVO vo, Model model) {
		int result = surveyDao.surveyDelete(vo);
		model.addAttribute("surveyResult", result);
	}

	@RequestMapping("survey/surveyCreate")
	public void insert(SurveyVO vo, Model model) {

		int result = surveyDao.surveyCreate(vo);
		String text = "설문지 문제 등록 성공";
		if (result != 1) {
			text = "설문지 문제 등록 실패";
		}
		model.addAttribute("result", text);
	}

	@RequestMapping("survey/surveyUpdate1")
	public void update(SurveyVO vo, Model model) {
		List<SurveyVO> surveyList = surveyDao.surveyList();
		model.addAttribute("surveyList", surveyList);
	}

	@RequestMapping("survey/surveyUpdate2")
	public void update2(SurveyVO vo, Model model) {
		// 수정하고 싶은 것이 있으면 수정처리 요청.
		int result = surveyDao.surveyUpdate(vo);
		String text = "설문지 수정 성공";
		if (result != 1) {
			text = "설문지 수정 실패";
		}
		model.addAttribute("result", text);
		model.addAttribute("readone", vo);
	}
}
