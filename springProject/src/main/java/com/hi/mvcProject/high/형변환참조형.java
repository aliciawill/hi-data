package com.hi.mvcProject.high;

public class 형변환참조형 {
	//주소가 들어가 있음.
	//상속관계에 있는 클래스들만 형변환이 가능
	
//	byte[] a = {1,2,3};
//	int[] b = a;

	public static void main(String[] args) {
		//부모클래스(큰)
		PhoneClass p = new PhoneClass();
		
		//자식클래스(작)
		PhoneClass a = new AppleKorea();
		PhoneInteface u = new AppleUSA();
		
		p = a; //자동형변환(큰<--작, 업캐스팅 )
		
		a = (AppleKorea)p; //강제형변환(작<--큰, 다운캐스팅)
		u = (AppleUSA)p; //강제형변환(작<--큰)
	}
	
	
	
}
