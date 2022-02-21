package com.hi.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //싱글톤 객체로 생성(주소) 
public class BookDAO {
	
	@Autowired
    SqlSessionTemplate my; //전역변수 
	//싱글톤으로 만든 mybatis객체의 주소를 찾아서 my변수에 넣어주세요.
	//DAO부품안에 myBatis부품을 끼워넣음.
	//Dependency(의존성) Injection(주입) : 의존성 주입(DI) 
	//의존성: 해당 부품이 반드시 필요하다라는 의미
	//주입: 의존성을 구현하고 싶으면 ram에 만들어놓은 주소를 쓰는 클래스의 
	//		변수에 주소를 넣어주세요.
    
	public void create(BookVO vo) throws Exception {
		System.out.println("dao에서 전달받은 값:" + vo);
		my.insert("book.create", vo);
	}
	public void read(BookVO vo) {
		my.selectOne("book.one", vo);
	}
	public void all() {
		my.selectList("book.all");
	}
	public void delete(BookVO vo) {
		my.delete("book.del", vo);
	}
	public void update(BookVO vo) {
		my.update("book.up", vo);
	}

}
