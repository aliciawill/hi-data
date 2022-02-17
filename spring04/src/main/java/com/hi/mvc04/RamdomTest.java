package com.hi.mvc04;

import java.util.Random;

public class RamdomTest {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			//System.out.println(r.nextBoolean());
			//System.out.println(r.nextInt(10));
			//0~9
			//int(4바이트, 방4개)
			//-21억~21억
			//int x = 2222222222;
			
			//1~10<--- 0~9
			//System.out.println(r.nextInt(10) + 1);
			
			//10~90 <--- 0~99
			System.out.println(r.nextInt(81) + 10);
			//80 + 10 => 90
		}
	}

}
