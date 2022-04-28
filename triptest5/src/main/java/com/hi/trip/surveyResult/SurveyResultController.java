package com.hi.trip.surveyResult;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.trip.survey.SurveyDAOInter;
import com.hi.trip.survey.SurveyVO;

@Controller
public class SurveyResultController {
	@Autowired
	SurveyResultDAOInter surveyResultDao;
	@Autowired
	SurveyDAOInter surveyDao;
	@RequestMapping("surveyResult/surveyResultList")
	public void list(Model model, HttpSession session) {
		// db Survey 테이블에서 VO 받아옴
		SurveyResultVO vo = new SurveyResultVO();
		session.setAttribute("member_idx", 1);  //합칠떄 뺴줘야함!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!읽어!!!!!!!!!!!!!!!!!!ㅈㅂ!!!!
		vo.setMember_idx((int)session.getAttribute("member_idx")); 
		List<SurveyResultVO> surveyResultList = surveyResultDao.surveyResultList(vo);
		List<SurveyVO> surveyList = surveyDao.surveyList();
		model.addAttribute("surveyResultList", surveyResultList);
		model.addAttribute("surveyList", surveyList);
		System.out.println("Controller에서 surveyResultList:"+surveyResultList);
		System.out.println("Controller에서 surveyList:"+surveyList);
	}
	
	@RequestMapping("surveyResult/surveyResultReadOne")
	public void one(SurveyResultVO vo, Model model, HttpSession session) {
		SurveyResultVO vo2 = surveyResultDao.surveyResultReadOne(vo);
		model.addAttribute("readone", vo2);
		session.setAttribute("member_idx", 1);
		System.out.println("vo2:"+vo2);
	}

	@RequestMapping("surveyResult/surveyResultDelete")
	public void delete(SurveyResultVO vo, Model model) {
		int result = surveyResultDao.surveyResultDelete(vo);
		model.addAttribute("surveyResultResult", result);
	}

	@RequestMapping("surveyResult/surveyResultCreate")
	public void insert(SurveyResultVO vo, Model model) {

		int result = surveyResultDao.surveyResultCreate(vo);
		String text = "설문지 결과 등록 성공";
		if (result != 1) {
			text = "설문지 결고 등록 실패";
		}
		model.addAttribute("result", text);
	}

//	@RequestMapping("surveyResult/surveyResultUpdate")
//	public void update(SurveyResultVO vo, Model model) {
//		SurveyResultVO vo2 = surveyResultDao.surveyResultReadOne(vo);
//		model.addAttribute("readone", vo2);
//	}
//
//	@RequestMapping("surveyResult/surveyResultUpdate2")
//	public void update2(SurveyResultVO vo, Model model) {
//		// 수정하고 싶은 것이 있으면 수정처리 요청.
//		int result = surveyResultDao.surveyResultUpdate(vo);
//		String text = "설문지결과 수정 성공";
//		if (result != 1) {
//			text = "설문지결과 수정 실패";
//		}
//		model.addAttribute("result", text);
//		model.addAttribute("readone", vo);
//	}
}
