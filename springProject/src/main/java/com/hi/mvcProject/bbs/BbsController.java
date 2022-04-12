package com.hi.mvcProject.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.mvcProject.ReplyDAO;
import com.hi.mvcProject.ReplyVO;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("bbs/bbsList")
	public void list(BbsVO vo, Model model) {
		List<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	@RequestMapping("bbs/bbsOne")
	public void one(BbsVO vo, Model model) {
		//게시물 1개짜리 vo2
		//replyList
		BbsVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
		
		List<ReplyVO> list = dao2.list(vo);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("bbs/bbsIn")
	public void insert(BbsVO vo, Model model) {
		//리뷰<--- movie(oriId, img)
		//insert into review values (null, #{oriId}, #{content}, #{writer})
		//화면만들때는 
		//review + movie(oriId, img)
		
		int result = dao.insert(vo);
		BbsVO vo2 = dao.createdId();
		String text = "게시물 작성 성공";
		if(result != 1) {
			text = "게시물 작성 실패";
		}
		model.addAttribute("result", text);
		model.addAttribute("id", vo2.getId());
	}
	@RequestMapping("bbs/bbsDel")
	public void delete(BbsVO vo, Model model) {
		int result = dao.del(vo);
		model.addAttribute("result", result);
	}
	@RequestMapping("bbs/bbsUp")
	public void update(BbsVO vo, Model model) {
		//수정하기버튼을 누르면, 기존의 db에 저장된 데이터를
		//가지고 와서, 수정할 수 있는 화면에 넣어주어야 한다. 
		BbsVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
	}
	@RequestMapping("bbs/bbsUp2")
	public String update2(BbsVO vo, Model model) {
		//수정하고 싶은 것이 있으면 수정처리 요청. 
		int result = dao.up(vo);
		if(result == 1) {
			return "bbsUp2";
		}else {
			return "no";
		}
	}
}
