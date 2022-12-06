<!-- @Author Grant Evans -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="JDBC.*" import="java.util.*"
	import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<%
//Gets the day that was clicked into a usable variable
String day = request.getParameter("SelectedDay");
session.setAttribute("currentDay", day);
//prints the day to console
System.out.println(day);

/**Takes the button that was pressed on the hompage and changes it to the date. dayParam is used
* later to get and display the correct menu.
*/
String dayParam = "";
if (day.equals("Sunday")) {
	dayParam = "10/16/2022";
}

if (day.equals("Monday")) {
	dayParam = "10/17/2022";
}

if (day.equals("Tuesday")) {
	dayParam = "10/18/2022";
}

if (day.equals("Wednesday")) {
	dayParam = "10/19/2022";
}

if (day.equals("Thursday")) {
	dayParam = "10/20/2022";
}

if (day.equals("Friday")) {
	dayParam = "10/21/2022";
}

if (day.equals("Saturday")) {
	dayParam = "10/22/2022";
}
%>
<html>
<head>
<style>
/* This sets design elements for the footer*/
.footer {
	position: fixed;
	bottom: 0;
	padding: 10px;
}

.header {
	padding: 30px;
	text-align: center;
	background: #D2042D;
	color: white;
	font-size: 50px;
	font-family: Times New Roman;
	font-weight: bold;
	background-image: linear-gradient(red, grey);
}

.menuBackground {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	height: 400px;
	background-image: linear-gradient(grey, white);
}

.menuItems {
	text-align: center;
	font-size: 30px;
}

.button {
	transition-duration: 0.4s;
	font-family: Verdana;
}

/*changes button to red while mouse hovers over button*/
.button:hover {
	background-color: #D2042D;
	color: white;
}
</style>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<div class="header">
	<h3>
		<%
		out.println(day + "'s Menu");
		%>
	</h3>
</div>
<body>
	<!-- This prints the selected day on the web page -->
	<div class="menuBackground">

		<%
		JDBCSelect js = new JDBCSelect();
		ArrayList<String> bList = js.getMenu(dayParam, "Breakfast");
		ArrayList<String> lList = js.getMenu(dayParam, "Lunch");
		ArrayList<String> dList = js.getMenu(dayParam, "Dinner");
		%>
		<div class="menuItems">
			<b>Breakfast</b> <br>
			<%
			for (String s : bList) {
				out.println(s);
				//if(js.getAverageRatingbyFoodItem(s) != null)
				//{
				//	out.println(", ");
				//	out.println(String.format("%.2f",js.getAverageRatingbyFoodItem(s)));
				//}
			%>
			<a href="./ViewFoodItem.jsp?food_item=<%=s%>">
				<button class="button" type="button">nutrition info</button>
			</a>
			<%

			%><br>
			<%
			}
			%>
			<br> <b>Lunch</b> <br>
			<%
			for (String s : lList) {
				out.println(s);
				//if(js.getAverageRatingbyFoodItem(s) != null)
				//{
				//	out.println(", ");
				//	out.println(String.format("%.2f",js.getAverageRatingbyFoodItem(s)));
				//}
			%><a href="./ViewFoodItem.jsp?food_item=<%=s%>">
				<button class="button" type="button">nutrition info</button>
			</a>
			<%

			%><br>
			<%
			}
			%>
			<br> <b>Dinner</b> <br>
			<%
			for (String s : dList) {
				out.println(s);
				//if(js.getAverageRatingbyFoodItem(s) != null)
				//{
				//	out.println(", ");
				//	out.println(String.format("%.2f",js.getAverageRatingbyFoodItem(s)));
				//}
			%><a href="./ViewFoodItem.jsp?food_item=<%=s%>">
				<button class="button" type="button">nutrition info</button>
			</a>
			<%

			%><br>
			<%
			}
			%>
		</div>
	</div>
	<!-- element to return to home page -->
	<div class="footer">
		<a href="HomePage.jsp">Back to Home Page</a>
	</div>
</body>
</html>