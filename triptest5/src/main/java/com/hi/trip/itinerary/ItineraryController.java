package com.hi.trip.itinerary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItineraryController {
	
	@Autowired
	ItineraryDAOInter itineraryDao = new ItineraryDAO();
	@RequestMapping("itinerary/itineraryList")
	public void list(ItineraryVO vo, Model model, HttpSession session, int pageNum) {
		
		List<ItineraryVO> itineraryList = itineraryDao.itineraryList(pageNum); // Dao에서 VO형태로 수신

		System.out.println("itineraryList:" + itineraryList);
		
		model.addAttribute("itineraryList", itineraryList);
		session.setAttribute("member_idx", "1");
	}
	
	@RequestMapping("itinerary/itineraryDelete")
	public void delete(ItineraryVO vo, Model model) {
		int result = itineraryDao.itineraryDelete(vo);
		model.addAttribute("itineraryResult", result);
	}

	@RequestMapping("itinerary/itineraryCreate")
	public void insert(ItineraryVO vo, Model model) {

		int result = itineraryDao.itineraryCreate(vo);
		String text = "설문지 문제 등록 성공";
		if (result != 1) {
			text = "설문지 문제 등록 실패";
		}
		model.addAttribute("result", text);
	}

	@RequestMapping("itinerary/itineraryUpdate1")
	public void update(ItineraryVO vo, Model model, int pageNum) {
		List<ItineraryVO> itineraryList = itineraryDao.itineraryList(pageNum);
		model.addAttribute("itineraryList", itineraryList);
	}

	@RequestMapping("itinerary/itineraryUpdate2")
	public void update2(ItineraryVO vo, Model model) {
		// 수정하고 싶은 것이 있으면 수정처리 요청.
		int result = itineraryDao.itineraryUpdate(vo);
		String text = "설문지 수정 성공";
		if (result != 1) {
			text = "설문지 수정 실패";
		}
		model.addAttribute("result", text);
		model.addAttribute("readone", vo);
	}
}
