package com.hi.mvcProject.high;

public class PhoneMain {

	public static void main(String[] args) {
		//객체생성은 완벽한 클래스만 가능
		//일반메서드만 있어야 객체생성 가능
		//추상메서드를 포함하고 있는 클래스는 객체생성안된다.
		//인터페이스로 객체생성 불가능함.~~!!
//		PhoneInteface p = new PhoneInteface();(X) 
		PhoneInteface phone = new PhoneClass();
		//phone.color = "빨강";
		//phone.size = 11;
	
		phone.call();
		
		
		AppleKorea a = new AppleKorea();
		a.pay();
		
		AppleUSA a2 = new AppleUSA();
		a2.pay();
		
	}

}
