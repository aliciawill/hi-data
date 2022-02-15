package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnect {

	public static void main(String[] args) throws Exception {
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공@@@");
		
		//2. db 연결 : 1) ip+port 2) username, 3) db명(big)
		String url="jdbc:mysql://localhost:3366/big";
		String user="root";
		String pass="1234";
		
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("2. db연결 성공@@@");
		//3. sql문을 생성
		String sql="insert into member(id, pw, name, tel) values('melon3', '1234', 'melon song', '013')";
		//String url="http://www.naver.com";
		//Url u=new Url(url);
		String ip="";
		//InetAddress i=InetAddress.getAllByName(ip);
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공.@@@");
		
		
		//4. 생성한 sql문을 mysql로 보낸다
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.@@@");
		
	}

}
