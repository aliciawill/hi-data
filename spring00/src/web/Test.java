package web;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		//1. mybatis로 idx리스트를 가지고 올 수 있는 mapper파일을 만들어야한다.
		
		//ArrayList<VO> list = new ArrayList<VO>();
		String s1 = "1,2,3"; //vo에서 해당 index값을 꺼내주세요.
		String s2 = "2,3";
		String s3 = "1,4,5";

		String s = s1 + "," + s2 + "," + s3;
		String[] result = s.split(","); //1,2,3,2,3,1,4,5
		System.out.println(s);
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < result.length; i++) {
			int result2 = Integer.parseInt(result[i]);
			set.add(result2);
		}
		System.out.println(set);

	}

}
