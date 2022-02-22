package com.hi.mvcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 싱글톤으로 만들어달라고 스프링에게 요청
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;

	//회원가입
	public int create(MemberVO vo) {
		return my.insert("member.create", vo);
	}
	//로그인
	public MemberVO login(MemberVO vo) {
		return my.selectOne("member.login", vo);
	}

}
