package com.hi.mvcProject.high;

import com.hi.mvcProject.bbs.BbsVO;

public interface BbsDAOInterface {

	//구현할 기능을 명세하는 문서역할인 인터페이스를 정의해보세요.
	//crud 메서드를 정의!
	//인터페이스를 implements해서
	//BbsDAOImple 클래스를 구현해보세요.
	//인터페이스에 기능을 정의할 목적으로 사용하는 메서드는
	//일반적인 메서드가 아님.
	//구체적인 구현이 빠져있음.
	//불완전한 메서드의 형태임.
	//구현이 빠져있는 불완전한 메서드: 추상메서드 
	//인터페이스에는 추상메서드만 써야함.!
	//abstract단어는 생략가능!
	//인터페이스에서 사용하는 메서드는 모두다 public!
	//public abstract 생략가능!!
	public abstract int insert(BbsVO vo);
	public int update(BbsVO vo);
	abstract int delete(BbsVO vo);
	BbsVO readOne(BbsVO vo);
}
