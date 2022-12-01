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

System.out.println("Inputs:");
System.out.println(email);
System.out.println(password);
System.out.println(firstName);
System.out.println(lastName);

JDBCUpdateDelete jud = new JDBCUpdateDelete();
jud.editProfile(email, password, firstName, lastName);

JDBCSelect js = new JDBCSelect();
ArrayList<String> al = js.getUser(email);
System.out.println("New User Data:");
System.out.println(al.get(0));
System.out.println(al.get(1));
System.out.println(al.get(2));
System.out.println(al.get(3));

response.sendRedirect("HomePage.jsp");

%>
</body>
</html>