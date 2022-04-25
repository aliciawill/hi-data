package com.hi.mvcProject.high;

import com.hi.mvcProject.bbs.BbsVO;

public interface BbsDAOInterface {

	//구현할 기능을 명세하는 문서역할인 인터페이스를 정의해보세요.
	//crud 메서드를 정의!
	//인터페이스를 implements해서
	//BbsDAOImple 클래스를 구현해보세요.
	public int insert(BbsVO vo);
	public int update(BbsVO vo);
	public int delete(BbsVO vo);
	public BbsVO readOne(BbsVO vo);
}
