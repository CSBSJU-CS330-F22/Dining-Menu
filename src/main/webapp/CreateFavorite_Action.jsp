<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//get the email of the current logged in user, gets the name of the food item
String email = (String)session.getAttribute("loggedInUser");
String foodItem = request.getParameter("food_item");
boolean noti = false;

//Outpurs email, foodItem, and noti to console for debugging
System.out.println(email);
System.out.println(foodItem);
System.out.println(noti);

//Creates a new JBDCInsert object and calls createFavorite method which will return a message about the creation
JDBCInsert ji = new JDBCInsert();
String s = ji.createFavorite(email, foodItem, noti);

//Prints message to console for debugging and redirects user to HomePage
System.out.println(s);
session.setAttribute("currentFoodItem", foodItem);
response.sendRedirect("ViewFoodItem.jsp");
%>
</body>
</html>
