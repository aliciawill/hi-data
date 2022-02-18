package com.hi.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component //싱글톤으로 만들어달라고 스프링에게 요청
public class MemberDAO {
	
	public void create(MemberVO vo) throws Exception {
		ps.executeUpdate();
	}
	public boolean login(MemberVO vo) throws Exception {
		return result;
	}
	public MemberVO readOne(MemberVO vo) throws Exception {
		return vo2;
		
	}
	public ArrayList<MemberVO> readAll() throws Exception {
		return list;
		
	}
	public void update(MemberVO vo) throws Exception {
		ps.executeUpdate();
	}
	public void delete(MemberVO vo) throws Exception {
		ps.executeUpdate();
	}
}
