package com.hi.mvcProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao; //di
	
	@RequestMapping("one")
	public void one(ProductVO vo, Model model) {
		ProductVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
	}
	@RequestMapping("list")
	public void list(Model model) {
		List<ProductVO> list = dao.all();
		model.addAttribute("list", list);
	}
}
