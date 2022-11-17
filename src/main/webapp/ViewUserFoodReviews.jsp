<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="JDBC.*" import="java.util.*" import="java.sql.*" import="java.io.*" import = "Food.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>

/*this sets design attributes to the header*/
.header {
	padding: 30px;
	text-align: center;
	background: #D2042D;
	color: white;
	font-size: 20px;
	font-family: Times New Roman;
}

/*this sets design attributes to the table*/
.table {
	padding: 30px;
	background: #bfbfbf;
	table-layout: fixed;
}

/*this sets design attributes for the buttons*/
.button {
	transition-duration: 0.4s;
	padding: 40px 30px;
}

/*changes button to red while mouse hovers over button*/
.button:hover {
	background-color: #D2042D;
	color: white;
}

/*this sets design attributes to the logo*/
.logo {
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 50%;
}

/*this sets design attributes to the footer*/
.aboutThisSite {
	position: fixed;
	bottom: 0;
	padding: 10px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: Black;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}











</style>

<body>
<%JDBCSelect js = new JDBCSelect();
JDBCInsert ji = new JDBCInsert();
%>



<%
String email = "";
// checks if user is logged in, if they are displays greeting and logout button
if(session.getAttribute("loggedInUser") != null)
{
	
	email = (String)session.getAttribute("loggedInUser");

}


ArrayList<ArrayList<String>> reviewList = js.getFoodReviewsByUser(email);
if(reviewList.isEmpty()){
	out.println("You have not submitted any reviews yet.  Voice your opinion on the food!");
}
else{
out.println("Reviews");
ArrayList<Review> reviews = new ArrayList<Review>();
for(ArrayList<String> r : reviewList){
	Review rv = new Review(r);
	reviews.add(rv);
}
%>
<br>
<% 
for(Review s : reviews)
{
	//Title, Rating/5
	out.println(s.getTitle() + ", " + s.getRating() + "/5");
	%>
	<br>
	<%
	//By: email@csbsju.edu
	out.println("By: " + s.getUserEmail());
	%>
	<br>
	<%
	//Review Description
	out.println(s.getReviewDescrip());
	%>
	<br>
	<br>
	<%
}
}
%>
<!-- element to return to home page -->
	<div class="footer">
		<a href="HomePage.jsp">Back to Home Page</a>
	</div>
</body>
</html>