<%@ page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>

<body>
<%
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://database-1.cslxhn5vh196.us-west-1.rds.amazonaws.com:3306/trip";
	String user = "root";
	String pass = "himedia00-=";
	Connection con = DriverManager.getConnection(url, user, pass);
	out.printl("db connection success...");
%>
</body>
</html>

