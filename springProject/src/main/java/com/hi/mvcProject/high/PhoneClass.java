package com.hi.mvcProject.high;

public class PhoneClass implements PhoneInteface {

	//불완전한 요소를 가지고 있지 않은 완벽한 클래스
	//완벽한 클래스는 객체생성해서 쓸 수 있다.
	
	//멤버변수 
	String color;
	int size;
	
	//일반 메서드
	@Override
	public void call() {
		System.out.println("전화하다.");
	}

	@Override
	public void internet() {
		System.out.println("인터넷하다.");

	}

	@Override
	public void text() {
		System.out.println("문자하다.");

	}

}
