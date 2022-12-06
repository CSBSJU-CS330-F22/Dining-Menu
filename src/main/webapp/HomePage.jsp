<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="JDBC.*" import="java.util.*"
	import="java.sql.*" import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>SJU Dining Menu</title>
</head>
<style>

/*this sets design attributes to the header*/
.header {
	padding: 30px;
	text-align: center;
	background: #D2042D;
	color: white;
	font-size: 30px;
	font-family: Times New Roman;
	font-weight: bold;
	background-image: linear-gradient(red, grey);
}

/*this sets design attributes to the table*/
.table {
	padding: 30px;
	background: #bfbfbf;
	table-layout: fixed;
	background-image: linear-gradient(grey, white);
}

/*this sets design attributes for the buttons*/
.button {
	transition-duration: 0.4s;
	padding: 40px 40px;
	font-family: Verdana;
}

/*changes button to red while mouse hovers over button*/
.button:hover {
	background-color: #D2042D;
	color: white;
}

html, body, .wrap {
	height: 70%;
	margin: 0;
	padding: 10;
}

.wrap {
	display: table;
	width: 100%;
}

.mid, .base {
	display: table-row;
	text-align: center
}

.base {
	height: 1px;
}

.image {
	vertical-align: middle;
	display: table-cell
}

.image img {
	width: 30%;
	height: auto;
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
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
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

.close:hover, .close:focus {
	color: red;
	cursor: pointer;
}

/* Add Zoom Animation */
.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s
}

@
-webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

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
	<%
String passString = "";
String fnString = "";
String lnString = "";
%>
	<%
//checks if user is logged in yet, if not displays login and create account buttons
if(session.getAttribute("loggedInUser") == null)
{
	%>
	<button onclick="document.getElementById('id01').style.display='block'"
		style="width: auto;">Login</button>
	<button onclick="document.getElementById('id02').style.display='block'"
		style="width: auto;">Create Account</button>
	<%
}
%>
	<%
// checks if user is logged in, if they are displays greeting and logout button
if(session.getAttribute("loggedInUser") != null)
{
	%>
	<a href="./ViewUserFoodReviews.jsp">
		<button style="width: auto;">My Reviews</button>
	</a>
	<a href="./ViewUserFavoriteFoodItems.jsp">
		<button style="width: auto;">My Favorites</button>
	</a>
	<button onclick="document.getElementById('id03').style.display='block'"
		style="width: auto;">Edit Profile</button>
	<a href="./Logout_Action.jsp">
		<button style="width: auto;">Logout</button>
	</a>
	<%
	String email = (String)session.getAttribute("loggedInUser");
	out.println("Hello, "+email);
	
	JDBCSelect js = new JDBCSelect();
	ArrayList<String> al = js.getUser(email);
	passString = al.get(1);
	fnString = al.get(2);
	lnString = al.get(3);
}
%>
	<div id="id01" class="modal">

		<form class="modal-content animate" action="Login_Action.jsp"
			method="post">
			<div class="imgcontainer">
				<span onclick="document.getElementById('id01').style.display='none'"
					class="close" title="Close Modal">&times;</span> <img
					src="https://user-images.githubusercontent.com/61028069/204590164-ec0885db-7ba0-4670-954c-2e6e27454779.png"
					width="500" height="500" width="500" height="500" alt="Avatar"
					class="avatar" height="250" width="15">
			</div>
			<!-- This is where users enter username/email and password to log in -->
			<div class="container">
				<label for="user_email"><b>Email</b></label> <input type="text"
					placeholder="Enter Email" name="user_email" required> <label
					for="user_password"><b>Password</b></label> <input type="password"
					placeholder="Enter Password" name="user_password" required>
				<label> <input type="checkbox" checked="checked"
					name="remember"> Remember Me
				</label>
				<button type="submit">Login</button>
			</div>

			<div class="container" style="background-color: #f1f1f1">
				<button type="button"
					onclick="document.getElementById('id01').style.display='none'"
					class="cancelbtn">Cancel</button>
				<span class="psw">Forgot <a href="#">Password?</a></span>
			</div>
		</form>
	</div>
	<div id="id02" class="modal">

		<form class="modal-content animate" action="CreateAccount_Action.jsp"
			method="post">
			<div class="imgcontainer">
				<span onclick="document.getElementById('id02').style.display='none'"
					class="close" title="Close Modal">&times;</span> <img
					src="https://user-images.githubusercontent.com/61028069/204590164-ec0885db-7ba0-4670-954c-2e6e27454779.png"
					width="500" height="500" width="500" height="500" alt="Avatar"
					class="avatar" height="250" width="15">
			</div>
			<!-- this is for new users to enter there information to create an account -->
			<div class="container">
				<label for="usr"><b>Email</b></label> <input type="text"
					placeholder="Enter Email" name="usr" required> <label
					for="pwd"><b>Password</b></label> <input type="password"
					placeholder="Enter Password" name="pwd" required> <label
					for="user_firstName"><b>First Name</b></label> <input type="text"
					placeholder="Enter First Name" name="user_firstName" required>

				<label for="user_lastName"><b>Last Name</b></label> <input
					type="text" placeholder="Enter Last Name" name="user_lastName"
					required> <label> <input type="checkbox"
					checked="checked" name="remember"> Remember Me
				</label>
				<button type="submit">Create Account</button>
			</div>

			<div class="container" style="background-color: #f1f1f1">
				<button type="button"
					onclick="document.getElementById('id02').style.display='none'"
					class="cancelbtn">Cancel</button>
				<span class="psw">Forgot <a href="#">Password?</a></span>
			</div>
		</form>
	</div>
	<div id="id03" class="modal">

		<form class="modal-content animate" action="EditProfile_Action.jsp"
			method="post">
			<div class="imgcontainer">
				<span onclick="document.getElementById('id03').style.display='none'"
					class="close" title="Close Modal">&times;</span> <img
					src="https://user-images.githubusercontent.com/61028069/204590164-ec0885db-7ba0-4670-954c-2e6e27454779.png"
					width="500" height="500" width="500" height="500" alt="Avatar"
					class="avatar" height="250" width="15">
			</div>
			<!-- this is for new users to enter there information to create an account -->
			<div class="container">
				<label for="usr"><b>Email</b></label> <input type="text"
					placeholder="Enter Email" name="usr"
					value="<%=(String)session.getAttribute("loggedInUser")%>" readonly>

				<label for="pwd"><b>Password</b></label> <input type="text"
					placeholder="Enter Password" name="pwd" value="<%=passString%>"
					required> <label for="user_firstName"><b>First
						Name</b></label> <input type="text" placeholder="Enter First Name"
					name="user_firstName" value="<%=fnString%>" required> <label
					for="user_lastName"><b>Last Name</b></label> <input type="text"
					placeholder="Enter Last Name" name="user_lastName"
					value="<%=lnString%>" required>

				<button type="submit">Save</button>
			</div>

			<div class="container" style="background-color: #f1f1f1">
				<button type="button"
					onclick="document.getElementById('id03').style.display='none'"
					class="cancelbtn">Cancel</button>
			</div>
		</form>
	</div>
	<!-- Header element -->
	<div class="header">
		<h1>Saint John's University Dining Menu</h1>
	</div>
	<!-- Table element -->
	<form method="post" action="ViewMenu.jsp" name="HomePage">
		<div class="table">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<!-- Buttons for days of the week -->
					<td><input class="button" value="Sunday" name="SelectedDay"
						type="submit"></td>
					<td><input class="button" value="Monday" name="SelectedDay"
						type="submit"></td>
					<td><input class="button" value="Tuesday" name="SelectedDay"
						type="submit"></td>
					<td><input class="button" value="Wednesday" name="SelectedDay"
						type="submit"></td>
					<td><input class="button" value="Thursday" name="SelectedDay"
						type="submit"></td>
					<td><input class="button" value="Friday" name="SelectedDay"
						type="submit"></td>
					<td><input class="button" value="Saturday" name="SelectedDay"
						type="submit"></td>


				</tr>
			</table>
		</div>
	</form>
	<!-- Logo element -->
	<div class="wrap">
		<div class="mid">
			<div class="image">
				<img
					src="data:image/png;base64,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"
					alt="Dining Service Logo">
			</div>
		</div>
	</div>
	<!-- about this site element -->
	<div class="aboutThisSite">
		<a href="AboutThisSite.html">About This Site</a>
	</div>

</body>
</html>
