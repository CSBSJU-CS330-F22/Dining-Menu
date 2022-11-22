<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//Gets the email of current logged in user and information from the create review form
String email = (String)session.getAttribute("loggedInUser");
String foodItem = request.getParameter("food_item");
String title = request.getParameter("title");
String description = request.getParameter("desc");
String rating = request.getParameter("rating");
Integer ratingInt = Integer.parseInt(rating);
boolean anon = false;

//Outputs food item, title, description, and rating to console for debugging
System.out.println(foodItem);
System.out.println(title);
System.out.println(description);
System.out.println(ratingInt);

//Creates new JDBCInsert Object and calls createReview method which will return a message about the creation
JDBCInsert ji = new JDBCInsert();
String s = ji.createReview(email, foodItem, ratingInt, title, description, anon);

//prints message to console for debugging and redirects to home page
System.out.println(s);
response.sendRedirect("HomePage.jsp");
%>
</body>
</html>
