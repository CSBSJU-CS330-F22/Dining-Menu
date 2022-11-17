<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<style>
/* This sets design elements for the footer*/
.footer {
	position: fixed;
	bottom: 0;
	padding: 10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Favorite Foods</title>
</head>
<%String email = (String)session.getAttribute("loggedInUser");
%><h3><% out.println(email+"'s Favorite Foods");
%>
</h3>
<br>
<%
JDBCSelect js = new JDBCSelect();
ArrayList<ArrayList<String>> favList = js.getFavoriteFoodItemsByUser(email);
ArrayList<String> foods = new ArrayList<String>();
if(favList.isEmpty()){
	out.println("No favorite foods :(");
}
for(ArrayList<String> foodList : favList){
	foods.add(foodList.get(0));
}
for(String name : foods){
	out.println(name);
	%><a href="./ViewFoodItem.jsp?food_item=<%=name%>"> 
	<button type="button">></button>
	</a><%
	%><br><%
}
%>
<body>
	<div class="footer">
		<a href="HomePage.jsp">Back to Home Page</a>
	</div>
</body>
</html>