package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hi.mvcProject.bbs.BbsVO;

@Component
public class TestDAO {

	@Autowired
	SqlSessionTemplate my; // di

	public List<TestVO> list() {
		return my.selectList("test.list");
	}



	public int insert(TestVO vo) {
		return my.insert("test.insert", vo);
	}


}
