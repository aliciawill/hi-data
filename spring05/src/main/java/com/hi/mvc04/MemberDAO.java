package com.hi.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //싱글톤으로 만들어달라고 스프링에게 요청
public class MemberDAO {
	
	@Autowired
    SqlSessionTemplate my; 
	
	public void create(MemberVO vo) throws Exception {
		my.insert("member.create", vo);
}
	public boolean login(MemberVO vo) throws Exception {
		return my.selectOne("member.login", vo);
	}
	public MemberVO readOne(MemberVO vo) throws Exception {
		return my.selectOne("member.one", vo);
		
	}
	public List<MemberVO> readAll() throws Exception {
		return my.selectList("member.all");
	}
	public void update(MemberVO vo) throws Exception {
		my.update("member.up", vo);
	}
	public void delete(MemberVO vo) throws Exception {
		my.delete("member.del", vo);
	}
}
