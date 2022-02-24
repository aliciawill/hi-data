package com.hi.mvcProject;

public class ReplyVO {
	private int id;
	private int bbsId;
	private String content;
	private String writer;


	//getter/setter : alt+shift+s+r
	//자동완성 등록(toString): ctrl+shift+z 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBbsId() {
		return bbsId;
	}

	public void setBbsId(int bbsId) {
		this.bbsId = bbsId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", bbsId=" + bbsId + ", content=" + content + ", writer=" + writer + "]";
	}

}
