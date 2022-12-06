<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String email = (String)session.getAttribute("loggedInUser");
String foodItem = request.getParameter("food_item");

System.out.println(email);
System.out.println(foodItem);

JDBCUpdateDelete jud = new JDBCUpdateDelete();
jud.removeFavorite(email, foodItem);

session.setAttribute("currentFoodItem", foodItem);
response.sendRedirect("ViewFoodItem.jsp");
%>

</body>
</html>