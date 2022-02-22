package com.kgitbank.mvcFinal;

public interface MemberInter {
	//구현할 기능에 대해서만 정의
	//1. 회원가입
	void insert(MemberDTO memberDTO);
	
	//2. 로그인처리
	int login(MemberDTO memberDTO);
}
