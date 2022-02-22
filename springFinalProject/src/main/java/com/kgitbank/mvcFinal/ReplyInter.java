package com.kgitbank.mvcFinal;

public interface ReplyInter {

	//1. 댓글을 추가
	void insert(ReplyDTO replyDTO);

	//2. 댓글을 삭제
	void delete(ReplyDTO replyDTO);

}