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
		//System.out.println(list.size());
		//System.out.println(list.get(0).text());
		String code = list.get(0).text();
		
		Elements list5 = doc.select("#middle > div.h_company > div.wrap_company > h2 > a");
		//System.out.println(list.size());
		String company = list5.get(0).text(); //회사이름
		//System.out.println(company);
		
		Elements list2 = doc.select("div.today span.blind");
		//#middle > div.h_company > div.wrap_company > div > span.code
		//System.out.println(list2.size());
		//System.out.println(list2.get(0).text());
		//System.out.println(list2.get(6).text());
		String today = list2.get(0).text();
		String[] s = today.split(","); //{"95","000"}
		String today2 = String.join("", s); //"95000"
		//System.out.println(today2);
		int today3 = Integer.parseInt(today2); //오늘가
		//System.out.println(today3 + 100);
		//System.out.println("==========");
		
		
		Elements list3 = doc.select("table > tbody > tr:nth-child(1) > td:nth-child(2) span.blind");
		//System.out.println(list3.get(0).text());
		String yesterday = list3.get(0).text();
		String[] y = yesterday.split(","); //{"95","000"}
		String yesterday2 = String.join("", y); //"95000"
		int yesterday3 = Integer.parseInt(yesterday2);
		
		Elements list4 = doc.select("td.first span.blind");
		//System.out.println(list4.get(0).text());
		String high = list4.get(0).text();
		String[] h = high.split(","); //{"94","900"}
		String high2 = String.join("", h); //"94900"
		int high3 = Integer.parseInt(high2);
		
		//1. 크롤링한 5개의 값을 vo에 넣어야 함.
		StockVO vo = new StockVO();
		vo.setCode(code);
		vo.setCompany(company);
		vo.setHigh(high3);
		vo.setToday(today3);
		vo.setYesterday(yesterday3);
		System.out.println(vo);
		//2. DAO에 vo을 주면서 insert해달라고 요청함. 
	} catch (IOException e) {
		System.out.println("크롤링하는 중 에러발생...");
		e.printStackTrace();
	} //1,2
		

	}

}
