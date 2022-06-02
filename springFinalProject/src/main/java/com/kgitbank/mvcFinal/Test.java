package com.kgitbank.mvcFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

	public static void main(String[] args) throws Exception {
			String id = "root";
			String pw = "1234";
			String name = "park";
			String tel = "011";
			
		// 1. 드라이버 설정
		// 메서드 호출하는 방법 2가지
		// 1)객체생성후, 메서드를 호출: 멤버변수가 힙영역에 복사, 지역변수가 생김
		//   지역변수로 일반메서드는 호출
		// 2)객체생성하지 않아도 클래스이름으로 static메서드 호출: 메서드 기능만 쓸 수 있음.
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("1. 드라이버 설정 성공<br>");
			
		// 2. db연결 1)url(ip+port+db명), 2)user, 3)pw
			String url = "jdbc:mysql://database-1.cqlh5as5aloo.us-west-1.rds.amazonaws.com:3306/shop";
			String user = "root";
			String password = "wjsdnwls12";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.print("2. DB연결 성공<br>");
		// 3. sql문 만들기
			/*
			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			out.print("3. SQL문 객체로 만들기 성공<br>");
			*/
		// 4. sql문 mysql로 전송하기
		/*
			int result = ps.executeUpdate(); //성공하면 1을 반환, 0을 반환, 1
			out.print("4. SQL문 mysql로 전송 결과>> " + result + "개<br>");
		*/


	}

}
