package com.hi.trip.itineraryComment;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ItineraryCommentController {
	@Autowired
	ItineraryCommentDAOInter itineraryCommentDao = new ItineraryCommentDAO();
	@RequestMapping("itineraryComment/itineraryCommentList")
	public void list(ItineraryCommentVO vo, Model model, HttpSession session) {
		
		List<ItineraryCommentVO> itineraryCommentList = itineraryCommentDao.itineraryCommentList(); // Dao에서 VO형태로 수신

		System.out.println("itineraryCommentList:" + itineraryCommentList);
		
		model.addAttribute("itineraryCommentList", itineraryCommentList);
		session.setAttribute("member_idx", "1");
	}
	
	@RequestMapping("itineraryComment/itineraryCommentDelete")
	public void delete(ItineraryCommentVO vo, Model model) {
		int result = itineraryCommentDao.itineraryCommentDelete(vo);
		model.addAttribute("itineraryCommentResult", result);
	}

	@RequestMapping("itineraryComment/itineraryCommentCreate")
	public void insert(ItineraryCommentVO vo, Model model) {

		int result = itineraryCommentDao.itineraryCommentCreate(vo);
		String text = "설문지 문제 등록 성공";
		if (result != 1) {
			text = "설문지 문제 등록 실패";
		}
		model.addAttribute("result", text);
	}

	@RequestMapping("itineraryComment/itineraryCommentUpdate1")
	public void update(ItineraryCommentVO vo, Model model) {
		List<ItineraryCommentVO> itineraryCommentList = itineraryCommentDao.itineraryCommentList();
		model.addAttribute("itineraryCommentList", itineraryCommentList);
	}

	@RequestMapping("itineraryComment/itineraryCommentUpdate2")
	public void update2(ItineraryCommentVO vo, Model model) {
		// 수정하고 싶은 것이 있으면 수정처리 요청.
		int result = itineraryCommentDao.itineraryCommentUpdate(vo);
		String text = "설문지 수정 성공";
		if (result != 1) {
			text = "설문지 수정 실패";
		}
		model.addAttribute("result", text);
		model.addAttribute("readone", vo);
	}
}
