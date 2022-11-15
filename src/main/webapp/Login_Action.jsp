<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String email = request.getParameter("user_email");
String password = request.getParameter("user_password");

System.out.println(email);
System.out.println(password);

JDBCInsert ji = new JDBCInsert();
Integer i = ji.login(email, password);
if(i == 1)
{
	session.setAttribute("loggedInUser", email);
	System.out.println("Login succeeded.");
	response.sendRedirect("HomePage.jsp");
}
else
{
	System.out.println("Login failed.");
	response.sendRedirect("HomePage.jsp");
}
%>
</body>
</html>