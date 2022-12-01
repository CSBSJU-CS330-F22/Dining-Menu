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
boolean noti = false;

System.out.println(email);
System.out.println(foodItem);
System.out.println(noti);

JDBCInsert ji = new JDBCInsert();
String s = ji.createFavorite(email, foodItem, noti);

System.out.println(s);
session.setAttribute("currentFoodItem", foodItem);
response.sendRedirect("ViewFoodItem.jsp");
%>
</body>
</html>