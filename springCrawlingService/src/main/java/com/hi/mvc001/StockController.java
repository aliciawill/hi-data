package com.hi.mvc001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockController {

	@Autowired
	StockDAO dao;
	
	@Autowired
	StockService service;
	
	@RequestMapping("create.do")
	public void insert(StockVO vo) {
		dao.insert(vo);
	}
	
	//입력한 코드(String)을 받아서 : controller 
	@RequestMapping("stock.do")
	public void insert2(String code) {
		service.crawl(code);
	}
	//크롤링을 한 후 : service 
	//db에 넣자. : dao
}
