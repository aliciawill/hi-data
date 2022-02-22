package com.kgitbank.mvcFinal;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO implements MemberInter{
	
	@Autowired
	SqlSessionTemplate my;

	@Override
	public void insert(MemberDTO memberDTO) {
		
	}

	@Override
	public int login(MemberDTO memberDTO) {
		return 0;
	}
}





