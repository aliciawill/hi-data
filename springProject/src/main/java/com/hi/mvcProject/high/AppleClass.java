package com.hi.mvcProject.high;

//extends라는 키워드(상속, 재사용)은
//기존의 틀(class)에 다른 기능과 속성을 더 붙여서 
//붙여서 새로운 틀을 만들고 싶을 때.
public abstract class AppleClass extends PhoneClass {
	//일반 메서드 3개를 이미 가지고 시작
	//call(), internet(), text()
	
	//한국, 미국의 구체적인 구현이 달라질 예정
	//기능에 대한 정의는 꼭 필요한 경우.
	//pay()기능이 꼭 있어야함을 명시.!
	//추상 메서드=> 불완전한 메서드 
	//추상메서드를 하나라도 가지고 있는 클래스면
	//이 클래스는 불완전하다라고 판단
	//객체 생성불가능.!
	//추상메서드를 하나라도 포함한 클래스는 불완전한 클래스
	//=> 추상클래스!
	//인터페이스가 아닌 클래스내에서 추상메서드를 쓰는 경우에는
	//public abstract을 생략할 수 없음.
	public abstract void pay();
}

