package com.hi.mvcProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@Autowired
	TestDAO dao;
	
	@RequestMapping("insert")
	public void name(TestVO vo) {
		System.out.println(vo);
		dao.insert(vo);
	}
	
	@RequestMapping("list2")
	public void list() {
		List<TestVO> list = dao.list();
		System.out.println(list.size());
		System.out.println(list);
	}
}
