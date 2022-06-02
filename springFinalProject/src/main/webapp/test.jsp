<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = "root";
			String pw = "1234";
			String name = "park";
			String tel = "011";
			
			Class.forName("com.mysql.jdbc.Driver");
			out.print("1. 드라이버 설정 성공<br>");

			String url = "jdbc:mysql://database-1.cqlh5as5aloo.us-west-1.rds.amazonaws.com:3306/shop";
			String user = "root";
			String password = "wjsdnwls12";
			Connection con = DriverManager.getConnection(url, user, password);
			out.print('2.db연결 성공')
%>
