package com.hi.mvcProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 서버가 요청받은 주소를 컨트롤할 수 있는 객체로 등록, 싱글톤을 만들어달라고 스프링에게 요청
public class ReplyController {

	@Autowired
	ReplyDAO dao;

	@RequestMapping("replyInsert")
	public void insert(ReplyVO vo, Model model) {
		int result = dao.insert(vo);
		ReplyVO vo2 = dao.createdId();
		vo.setId(vo2.getId());
		if(result == 1) {
			model.addAttribute("one", vo);
		}
	}

	@RequestMapping("replyDelete")
	public void delete(ReplyVO vo, Model model) {
		dao.delete(vo);
	}
}
