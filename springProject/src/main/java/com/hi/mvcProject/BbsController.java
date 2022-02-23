package com.hi.mvcProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbsList")
	public void list(BbsVO vo, Model model) {
		List<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	@RequestMapping("bbsOne")
	public void one(BbsVO vo, Model model) {
		//게시물 1개짜리 vo2
		//replyList
		BbsVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
	}
	@RequestMapping("bbsIn")
	public void insert(BbsVO vo, Model model) {
		int result = dao.insert(vo);
		BbsVO vo2 = dao.createdId();
		String text = "게시물 작성 성공";
		if(result != 1) {
			text = "게시물 작성 실패";
		}
		model.addAttribute("result", text);
		model.addAttribute("id", vo2.getId());
	}
	@RequestMapping("bbsDel")
	public void delete(BbsVO vo, Model model) {
		int result = dao.del(vo);
		model.addAttribute("result", result);
	}
	@RequestMapping("bbsUp")
	public void update(BbsVO vo, Model model) {
		
	}
	@RequestMapping("bbsUp2")
	public void update2(BbsVO vo, Model model) {
		
	}
}
