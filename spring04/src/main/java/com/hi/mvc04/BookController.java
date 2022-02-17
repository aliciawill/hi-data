package com.hi.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링이라는 프로그램에 컨트롤러로 등록
public class BookController {
	//@
	//hera@naver.com (at -에)
	//Annotation (표시, 어노테이션)
	
	@RequestMapping("insert.do")
	public void insert(BookVO vo, BookDAO dao) throws Exception {
		System.out.println("북마크 제어 요청됨.");
		dao.create(vo);
	}
}
