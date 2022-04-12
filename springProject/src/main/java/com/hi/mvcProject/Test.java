package com.hi.mvcProject;

public class Test {

	public static void main(String[] args) {
		int z = test(100);
		System.out.println(z);
		
	}
	
	public static int test(int x) { //100
		x = 200; 
		test2(x);
		return x + 300;
	}
	public static int test2(int x) {
		return x;
	}
}

