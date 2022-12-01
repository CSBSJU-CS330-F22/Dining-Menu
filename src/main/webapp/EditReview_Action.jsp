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

System.out.println(email);
System.out.println(foodItem);
System.out.println(title);
System.out.println(description);
System.out.println(ratingInt);

JDBCUpdateDelete jud = new JDBCUpdateDelete();
jud.editReview(email, foodItem, ratingInt, title, description);

response.sendRedirect("ViewUserFoodReviews.jsp");

%>
</body>
</html>