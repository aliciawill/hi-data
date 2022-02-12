package pack02.subPack;

public class Phone {
	//멤버변수 3개 
	String color; //선언! 전역변수!(global), 변수의 자동 초기화 
	//null로 초기화 
	int size; //0으로 초기화
	int price = 0;
	
	
	//멤버메서드 2개
	public void tel(String no) {
		System.out.println(no + "로 전화를 걸다.");
	}
	
	public void kakao(String name) {
		System.out.println(name + "과 카톡하다.");
	}

	@Override
	public String toString() {
		return "휴대폰 [색 =" + color + ", 크기 =" + size + ", 가격 =" + price + "]";
	}
	
	//toString()오버라이드
	
}
