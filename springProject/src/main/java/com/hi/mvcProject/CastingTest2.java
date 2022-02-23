package com.hi.mvcProject;

import java.util.ArrayList;

public class CastingTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hong");
		list.add(100); //int->Integer->Object
		
		String name = (String)list.get(0);
		
		/////////////////////////////////
		//객체 생성시 <넣고 싶은 타입>을 쓰면, 형변환 필요 없음.
		//제너릭 프로그래밍, jdk1.8
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hong2");
		list2.add("kim2");
		
		String name2 = list2.get(0);
	}

}
