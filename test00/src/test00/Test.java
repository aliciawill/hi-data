package test00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		ArrayList<Map<String, Object>> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Map product = new HashMap<String, Object>();
			product.put("idx", i + 1);
			product.put("like", 0);
			product.put("price", 10);
			product.put("title", "물건제목" + i);
			list.add(product);
		}
		System.out.println(list);
		
		
		ArrayList<Map<String, Object>> list2 = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				Map product = new HashMap<String, Object>();
				product.put("idx", i + 1);
				product.put("like", i + 1);
				list2.add(product);
			}
		}
		System.out.println(list2);
		
		System.out.println("--------------");
		
		System.out.println(list2.size());
		
		for (int i = 0; i < list2.size(); i++) {
			Map<String, Object> map2 = list2.get(i);
			int idx = (int)map2.get("idx");
			int like = (int)map2.get("like");
			Map<String, Object> map = list.get(idx-1);
			map.put("like", like);
		}
		System.out.println(list);
		
	}

}
