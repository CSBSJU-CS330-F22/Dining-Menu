
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=request.getParameter("food_item") %></title>
</head>
<body>
<h3>
<%
JDBCSelect js = new JDBCSelect();
String foodItem = request.getParameter("food_item");
out.println(foodItem);
if(js.getAverageRatingbyFoodItem(foodItem) != null)
{
	out.print("          ");
	out.print(String.format("%.2f",js.getAverageRatingbyFoodItem(foodItem)));
	out.print("/5");
}
%>
</h3>
<%
ArrayList<String> foodList = js.getFoodItem(foodItem);
out.println("Nutrition Information");
%>
<br>
<%
out.println("Calories: ");
out.println(foodList.get(2));
%>
<br>
<%
out.println("Fat: ");
out.println(foodList.get(3)); 
%>
<br>
<%
out.println("Cholesterol: ");
out.println(foodList.get(4)); 
%>
<br>
<%
out.println("Carbs: ");
out.println(foodList.get(5)); 
%>
<br>
<%
out.println("Protein: ");
out.println(foodList.get(6)); 
%>
<br>
<br>
<%
ArrayList<ArrayList<String>> reviewList = js.getFoodReviewsByFoodItem(foodItem);
out.println("Reviews");
%>
<br>
<% 
for(ArrayList<String> l : reviewList)
{
	out.println(l.get(3) + ", " + l.get(2) + "/5");
	%>
	<br>
	<%
	out.println("By: " + l.get(1));
	%>
	<br>
	<%
	out.println(l.get(4));
	%>
	<br>
	<br>
	<%
}
%>
</body>
</html>