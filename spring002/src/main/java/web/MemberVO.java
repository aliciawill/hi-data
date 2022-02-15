package web;

public class MemberVO {

	//데이터들을 전달할 때
	//데이터들을 넣어줄 가방역할의 클래스가 필요
	//변수를 만들어서 값만 넣었다 뻈다만 함.
	//Value Object
	//Data Transfer Object(DTO)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	
}
