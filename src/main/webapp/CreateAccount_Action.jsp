<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String email = request.getParameter("usr");
String password = request.getParameter("pwd");
String firstName = request.getParameter("user_firstName");
String lastName = request.getParameter("user_lastName");

System.out.println(email);
System.out.println(password);
System.out.println(firstName);
System.out.println(lastName);

JDBCInsert ji = new JDBCInsert();
String s = ji.createAccount(email, password, firstName, lastName);

System.out.println(s);
response.sendRedirect("HomePage.jsp");
%>
</body>
</html>