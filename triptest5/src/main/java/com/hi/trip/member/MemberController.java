package com.hi.trip.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("member/createMember")
	public void createMember(MemberVO vo)
	{
		System.out.println(vo);
		dao.create(vo);
	}
	
	@RequestMapping("member/idCheck")
	public void idCheck(String id, Model model)
	{
		System.out.println("ajax로 받은 데이터 " + id);
		MemberVO vo=new MemberVO();
		vo.setMember_id(id);
		vo=dao.selectOneId(vo);
		System.out.println(vo);
		
		if(vo!=null)
		{
			model.addAttribute("result", true);
		}
		else
		{
			model.addAttribute("result", false);
		}
		
		
	}
	
	@RequestMapping("member/nameCheck")
	public void nameCheck(String name, Model model)
	{
		System.out.println("ajax로 받은 데이터 " + name);
		MemberVO vo=new MemberVO();
		vo.setMember_name(name);
		vo=dao.selectOneName(vo);
		
		if(vo!=null)
		{
			model.addAttribute("result", true);
		}
		else
		{
			model.addAttribute("result", false);
		}
	}
	
	@RequestMapping("member/loginHitrip")
	public String loginHitrip(MemberVO vo, HttpSession session)
	{
		System.out.println(vo);
		vo=dao.loginHiTrip(vo);
		
		if(vo!=null)
		{
			session.setAttribute("member_idx", vo.getMember_idx());
			session.setAttribute("member_name", vo.getMember_name());
			session.setAttribute("member_type", vo.getMember_type());
			System.out.println("세션 등록 성공");
			return "redirect:../main.jsp";
		}
		else
		{
			return "member/loginFail";
		}
		
	}
	
	@RequestMapping("member/loginNaver")
	public String loginNaver(Model model,HttpSession session, String id, String birthyear)
	{
		System.out.println(id+" "+birthyear);
		MemberVO vo=new MemberVO();
		vo.setMember_naver_token(id);
		vo=dao.loginNaver(vo);
		
		if(vo!=null)
		{
			session.setAttribute("member_idx", vo.getMember_idx());
			session.setAttribute("member_name", vo.getMember_name());
			session.setAttribute("member_type", vo.getMember_type());
			System.out.println("세션 등록 성공");
			return "redirect:loginMain.jsp";
		}
		else
		{
			return "redirect:createNaverForm.jsp";
		}
		
	}
	
	@RequestMapping("member/loginGoogle")
	public void loginGoogle()
	{
		
	}
	
	@RequestMapping("member/logout")
	public void logout(HttpSession session)
	{
		session.removeAttribute("member_idx");
		session.removeAttribute("member_name");
		session.removeAttribute("member_type");	
	}
	
	
	
}
