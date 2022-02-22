package com.kgitbank.mvcFinal;

import java.util.ArrayList;

public interface BbsInter {
	//1. 전체 검색 기능
	ArrayList<BbsDTO> list();
	
	//2. 하나 검색 기능
	BbsDTO select(BbsDTO bbsDTO);
	
	//3. 게시판 작성 기능
	void insert(BbsDTO bbsDTO);
}
