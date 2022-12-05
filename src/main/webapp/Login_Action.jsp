<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//Gets email and password parameters from the login form
String email = request.getParameter("user_email");
String password = request.getParameter("user_password");

//Outputs email and password to console for debugging purposes
System.out.println(email);
System.out.println(password);

//Calls login method, if returns 1 then login successful, else login failed 
JDBCInsert ji = new JDBCInsert();
Integer i = ji.login(email, password);
if(i == 1)
{
	//Sets loggedInUser attribute to the email, outputs message to console, and redirects user back to the home page
	session.setAttribute("loggedInUser", email);
	System.out.println("Login succeeded.");
	response.sendRedirect("HomePage.jsp");
}
else
{
	//Outputs message to console, and redirects user back to the home page
	System.out.println("Login failed.");
	response.sendRedirect("Login_Failed.jsp");
}
%>
</body>
</html>
