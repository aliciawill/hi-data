package com.hi.trip.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void create(MemberVO vo) 
	{
		my.insert("member.create", vo);
	}
	
	public MemberVO selectOneId(MemberVO vo)
	{
		return my.selectOne("member.oneId", vo);
	}
	
	public MemberVO selectOneName(MemberVO vo)
	{
		return my.selectOne("member.oneName", vo);
	}
	
	public MemberVO loginHiTrip(MemberVO vo)
	{
		return my.selectOne("member.loginHiTrip", vo);
	}
	
	public MemberVO loginNaver(MemberVO vo)
	{
		return my.selectOne("member.loginNaver", vo);
	}
	
	
}