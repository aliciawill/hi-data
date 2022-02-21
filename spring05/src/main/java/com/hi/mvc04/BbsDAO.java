package com.hi.mvc04;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int create(BbsVO vo) {
		return my.insert("bbs.create", vo);
		//namespace.id
	}
}
