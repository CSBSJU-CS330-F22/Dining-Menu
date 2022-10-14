<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
//Gets the day that was clicked into usable variable
String day = request.getParameter("SelectedDay");
//prints the day to console
System.out.println(day);
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
</style>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
	<!-- This prints the selected day on the web page -->
	Day selected: <%out.println(day);%>
	
	<!-- element to return to home page -->
	<div class="footer">
		<a href="HomePage.html">Back to Home Page</a>
	</div>
</body>
</html>