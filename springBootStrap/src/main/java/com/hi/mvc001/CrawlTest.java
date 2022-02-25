package com.hi.mvc001;

import java.io.IOException;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CrawlTest {

	public static void main(String[] args) {
		// 1. 사이트에 연결 요청(http요청)
		// 2. html문서를 받아온다.(http응답) 7000줄 코드를 받음.
		// 3. 조건을 주어 추출하고자 하는 위치를 찾아서 해당 노드를 가지고 온다.
		//    결과는 list자료구조를 사용 
		//    기존에 ArrayList를 재사용해서 기능을 더 붙여놓은
		//    Elements(상속해서 만들어 놓음.)
		String url = "https://finance.naver.com/item/main.naver?code=035720";
		
	try {
		Document doc = Jsoup.connect(url).get();
		//System.out.println(doc);
		Elements list = doc.select("span.code");
		System.out.println(list.size());
		System.out.println(list.get(0).text());
		
		Elements list2 = doc.select("div.today span.blind");
		//#middle > div.h_company > div.wrap_company > div > span.code
		//System.out.println(list2.size());
		System.out.println(list2.get(0).text());
		//System.out.println(list2.get(6).text());
		String today = list2.get(0).text();
		String[] s = today.split(",");
		String today2 = String.join("", s);
		System.out.println(today2);
	} catch (IOException e) {
		System.out.println("크롤링하는 중 에러발생...");
		e.printStackTrace();
	} //1,2
		

	}

}
