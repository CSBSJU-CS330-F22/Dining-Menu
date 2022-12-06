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

.menuBackground {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	height: 400px;
	background-image: linear-gradient(red,grey, white);
	font-size:40px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Favorite Foods</title>
</head>
<div class="menuBackground">
<%String email = (String)session.getAttribute("loggedInUser");
%><h3><% out.println(email+"'s Favorite Foods");
%>
</h3>
<br>

<%
//connection to the JDBC controller
JDBCSelect js = new JDBCSelect();

//Retrieving favorite food items from the database
ArrayList<ArrayList<String>> favList = js.getFavoriteFoodItemsByUser(email);
ArrayList<String> foods = new ArrayList<String>();

// if list is empty displays that the user has no favorite foods
if(favList.isEmpty()){
	out.println("No favorite foods :(");
}

//goes through arraylist and creates food items for each favorite food
for(ArrayList<String> foodList : favList){
	foods.add(foodList.get(0));
}

//displays each food and reference to the food item to see nutrition for each food item
for(String name : foods){
	out.println(name);
	%><a href="./ViewFoodItem.jsp?food_item=<%=name%>"> 
	<button type="button">></button>
	</a><%
	%><br><%
}
%>
</div>
<body>

	<div class="footer">
		<a href="HomePage.jsp">Back to Home Page</a>
	</div>
</body>
</html>