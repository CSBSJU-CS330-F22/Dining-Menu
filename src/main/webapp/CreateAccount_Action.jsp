<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//Gets email, password, first name, and last name parameters from previous page
String email = request.getParameter("usr");
String password = request.getParameter("pwd");
String firstName = request.getParameter("user_firstName");
String lastName = request.getParameter("user_lastName");

//Outputs email, password, first name, and last name to console for debugging purposes
System.out.println(email);
System.out.println(password);
System.out.println(firstName);
System.out.println(lastName);

//Calls createAccount method which will return a message about the creation (successfully created or account already exists)
JDBCInsert ji = new JDBCInsert();
String s = ji.createAccount(email, password, firstName, lastName);

//Prints message to console for debugging purposes and redirects the user back to the home page
System.out.println(s);
response.sendRedirect("HomePage.jsp");
%>
</body>
</html>
