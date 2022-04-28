package com.hi.trip.member;

public class MemberVO {
	int member_idx;
	String member_id;
	String member_pw;
	String member_name;
	String member_birth;
	String member_addr;
	int member_gender;
	String member_naver_token;
	String member_google_token;
	int member_type;
	
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_addr() {
		return member_addr;
	}
	public void setMember_addr(String member_addr) {
		this.member_addr = member_addr;
	}
	public int getMember_gender() {
		return member_gender;
	}
	public void setMember_gender(int member_gender) {
		this.member_gender = member_gender;
	}
	public String getMember_naver_token() {
		return member_naver_token;
	}
	public void setMember_naver_token(String member_naver_token) {
		this.member_naver_token = member_naver_token;
	}
	public String getMember_google_token() {
		return member_google_token;
	}
	public void setMember_google_token(String member_google_token) {
		this.member_google_token = member_google_token;
	}
	public int getMember_type() {
		return member_type;
	}
	public void setMember_type(int member_type) {
		this.member_type = member_type;
	}
	
	@Override
	public String toString() {
		return "MemberVO [member_idx=" + member_idx + ", member_id=" + member_id + ", member_pw=" + member_pw
				+ ", member_name=" + member_name + ", member_birth=" + member_birth + ", member_addr=" + member_addr
				+ ", member_gender=" + member_gender + ", member_naver_token=" + member_naver_token
				+ ", member_google_token=" + member_google_token + ", member_type=" + member_type + "]";
	}
	
	
	
	
}
