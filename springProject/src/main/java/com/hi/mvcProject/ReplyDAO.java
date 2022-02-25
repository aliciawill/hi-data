package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReplyDAO {

	@Autowired
	SqlSessionTemplate my; // di

	public ReplyVO createdId() {
		return my.selectOne("reply.createdId");
	}

	// 특정한 bbsid에 해당하는 댓글의 목록
	public List<ReplyVO> list(BbsVO vo) {
		return my.selectList("reply.list", vo);
	}

	public int insert(ReplyVO vo) {
		return my.insert("reply.insert", vo);
	}

	public int delete(ReplyVO vo) {
		return my.delete("reply.delete", vo);
	}
}
