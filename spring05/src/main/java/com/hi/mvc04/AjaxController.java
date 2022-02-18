package com.hi.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxController {

	
	@RequestMapping("movie")
	public void name(String title, int price, Model model) {
		System.out.println("ajax로 받은 데이터 " + title + " " + price);
		double price2 = price * 0.8;
		//model : 결과를 담는 views아래까지만 데이터를 전달하고 ram에서 삭제!
		model.addAttribute("title", title);
		model.addAttribute("price2", (int)price2); //강제타입변환
		//강제타입변환(강제형변환)==> 캐스팅(casting)
	}
	
	@RequestMapping("user")
	public void user(String user, Model model) {
		System.out.println("ajax로 받은 데이터 " + user);
		//dao에 userid를 주면서 이미 있는지 아닌지 체크
		//select * from member where id = 'user';
		String[] list = {"apple", "melon", "summer"};
		String result = "사용가능한 id입니다.";
		for (String s : list) {
			if(s.equals(user)) {
				result = "사용불가능한 id입니다.";
			}
		}
		model.addAttribute("result", result);
		
	}
}





