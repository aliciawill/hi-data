package com.kgitbank.mvcFinal;

public class ReplyDTO {
	private String id;
	private String oriId;
	private String content;
	private String writer;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOriId() {
		return oriId;
	}
	public void setOriId(String oriId) {
		this.oriId = oriId;
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
		return "ReplyDTO [id=" + id + ", oriId=" + oriId + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
