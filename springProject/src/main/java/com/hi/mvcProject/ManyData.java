package com.hi.mvcProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ManyData {

	public static void main(String[] args) {
		// 1. 고정된 크기를 가지고 있는 경우,
		//	  크기의 변화가 별로 없는 경우
		// 토익 990개 문제 
		// 정답, 내답 
		// => 배열 
		int[] 정답 = new int[990];
		int[] 내답 = new int[990];
		
		Random r = new Random(100);
		for (int i = 0; i < 990; i++) {
			정답[i] = r.nextInt(4) + 1; //1~4
			내답[i] = r.nextInt(4) + 1; //1~4
		}
		
		int count = 0;
		for (int i = 0; i < 990; i++) {
			if(정답[i] == 내답[i]) {
				count++;
			}
		}
		System.out.println("최종 성적은 " + count + "점");

		
		//2. 가변적인 크기를 가지는 경우, 크기의 변화가 많은 경우
		//   장바구니(+++, -), 게시판, 상품목록
		List<String> list = new ArrayList();
		//설계상의 오버로딩(다형성)
		//다형성: 하나의 이름으로 여러가지 형태를 구현할 수 있도록
		//      하는 성질 
		//부모타입(큰) = 자식타입(작은)
		list.add("홍길동");
		list.add("김길동");
		list.add("송길동");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		//파이썬에서는 배열이 없고, list만 있음.
	}
}
