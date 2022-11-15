<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String email = (String)session.getAttribute("loggedInUser");
String foodItem = request.getParameter("food_item");
String title = request.getParameter("title");
String description = request.getParameter("desc");
String rating = request.getParameter("rating");
Integer ratingInt = Integer.parseInt(rating);
boolean anon = false;

System.out.println(foodItem);
System.out.println(title);
System.out.println(description);
System.out.println(ratingInt);

JDBCInsert ji = new JDBCInsert();
String s = ji.createReview(email, foodItem, ratingInt, title, description, anon);

System.out.println(s);
response.sendRedirect("HomePage.jsp");
%>
</body>
</html>