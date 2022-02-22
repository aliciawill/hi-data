package com.kgitbank.mvcFinal;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

	@ResponseBody
	@RequestMapping("jsonList")
	public ArrayList<BbsDTO> jsonList() {
		ArrayList<BbsDTO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			BbsDTO dto = new BbsDTO();
			dto.setId(i+""+i+i);
			dto.setTitle(i+""+i+i);
			dto.setContent(i+""+i+i);
			dto.setWriter(i+""+i+i);
			list.add(dto);
		}
		return list;
	}
	
	@ResponseBody
	@RequestMapping("json")
	public BbsDTO json() {
		BbsDTO dto = new BbsDTO();
		dto.setId("333");
		dto.setTitle("333");
		dto.setContent("333");
		dto.setWriter("333");
		return dto;
	}
}
