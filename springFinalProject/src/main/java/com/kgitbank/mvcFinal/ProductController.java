package com.kgitbank.mvcFinal;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;
	
	@RequestMapping("product")
	public void list(Model model) {
		List<ProductDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one")
	public void one(ProductDTO productDTO, Model model) {
		ProductDTO dto = dao.select(productDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("basket")
	public void basket(ProductDTO productDTO, HttpSession session) {
		//세션을 이용한 장바구니 처리
		//1.장바구니가 이미 만들어져 있는지 확인
		//	(장바구니 세션이 만들어져 있는지 확인)
		ArrayList<ProductDTO> list2 = (ArrayList<ProductDTO>)session.getAttribute("basket");
		
		if(list2 != null) {
			list2.add(productDTO);
		}else {
			list2 = new ArrayList<ProductDTO>();
			list2.add(productDTO);
		}
		session.setAttribute("basket", list2);
		System.out.println("-----장바구니 내용(개수): " + list2.size() + "개-----");
		System.out.println(list2);
		
		//2.장바구니(list session)가 이미 있는 경우
		//  2-1.목록을 가지고 와서
		//	2-2.목록에 내 dto를 추가
		//	2-3.dto가 추가된 목록을 다시 세션으로 지정
		//3.장바구니가 없는 경우
		//	3-1.list를 만들어서
		//	3-2.그 list를 세션으로 지정
		
		//4. 장바구니의 현재까지의 총 금액을
		//	 오른쪽 top2.jsp에 넣어주기 위해서는
		//	 총금액을 구해서 session의 속성으로 set!
		
		int sum = 0;
		for (int i = 0; i < list2.size(); i++) {
			ProductDTO dto2 = list2.get(i);
			sum = sum + Integer.parseInt(dto2.getPrice());
		}
		session.setAttribute("total", sum);
		session.setAttribute("count", list2.size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
