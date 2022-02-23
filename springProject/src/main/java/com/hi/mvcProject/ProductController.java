package com.hi.mvcProject;

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
	ProductDAO dao; // di

	@RequestMapping("plus")
	public void plus(ProductVO vo, Model model, HttpSession session) {
		//기존에 있는 장바구니 세션을 가지고 와서, 10개 
		//지역변수는 반드시 초기화해주는 습관을 가지자!!!
		//전역변수는 자동 초기화
		//기본형(값): 정수, 실수, 문자1, 논리
		//기본형 초기화: 해당 타입의 값으로 초기화
		//참조형(주소): 객체, 클래스, 배열, ....
		//참조형 초기화: null로 초기화
		//변수는 언제생기는가? 변수선언할 때 생김!
		//변수타입 변수명; //변수선언!
		ArrayList<ProductVO> list = null;
		if(session.getAttribute("basket") != null) {
			//기존에 장바구니에 넣은 목록이 있었고, 그것이 세션이 잡혀있었음.
			//ArrayList(작은, 자식, 아래)<---Object(큰, 부모, 위)
			//강제타입변환(강제형변환), 다운캐스팅
			//(변환하고 싶은 타입)
			list = (ArrayList<ProductVO>)session.getAttribute("basket");
		}else { //처음 장바구니에 넣는 경우.
			//한번도 장바구니에 넣은 적이 없어서, 세션으로 잡혀있는 것도 없음.
			//리스트를 만들어주어야 함. 
			list = new ArrayList<ProductVO>();
		}
		//새로운 물건을 장바구니 목록에 추가, 11개 
		list.add(vo);
		//세션을 새로운 목록으로 업데이트
		//session의 값 변수의 타입은 Object으로 되어있음.
		//어떤 타입이든 모두가 다 Object의 상속이므로
		//모든 타입들을 Object으로 선언된 변수에 넣을 수 있다.
		//String(작은, 아래, 자식)-->Object(큰, 위, 최상위부모) 
		//자동타입변환(자동형변환), 업캐스팅
		//ArrayList-->Object
		session.setAttribute("basket", list);
//		public void setAttribute(String name, Object value) {
//			
//		}
	}
	
	
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
