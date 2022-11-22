<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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

<%
//checks if user is logged in yet, if not displays login and create account buttons
if(session.getAttribute("loggedInUser") == null)
{
	%>
	<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Login</button>
	<button onclick="document.getElementById('id02').style.display='block'" style="width:auto;">Create Account</button>
	<%
}
%>
<%
// checks if user is logged in, if they are displays greeting and logout button
if(session.getAttribute("loggedInUser") != null)
{
	%>
	<a href="./ViewUserFoodReviews.jsp"> 
	<button style="width:auto;">My Reviews</button>
	</a>
	<a href="./ViewUserFavoriteFoodItems.jsp"> 
	<button style="width:auto;">My Favorites</button>
	</a>
	<a href="./Logout_Action.jsp"> 
	<button style="width:auto;">Logout</button>
	</a>
	<%
	String email = (String)session.getAttribute("loggedInUser");
	out.println("Hello, "+email);
}
%>
<div id="id01" class="modal">
  
  <form class="modal-content animate" action="Login_Action.jsp" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="https://user-images.githubusercontent.com/99437824/197000824-fab9e603-2964-483c-9c0d-6f7bde516a0f.png" width= "500" height = "500" width= "500" height = "500" alt="Avatar" class="avatar" height="250" width="15">
    </div>
/* This is where users enter username/email and password to log in */
    <div class="container">
      <label for="user_email"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="user_email" required>

      <label for="user_password"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="user_password" required>
         <label>
        <input type="checkbox" checked="checked" name="remember"> Remember Me
      </label>
      <button type="submit">Login</button>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">Password?</a></span>
    </div>
  </form>
</div>
<div id="id02" class="modal">
  
  <form class="modal-content animate" action="CreateAccount_Action.jsp" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="https://user-images.githubusercontent.com/99437824/197000824-fab9e603-2964-483c-9c0d-6f7bde516a0f.png" width= "500" height = "500" width= "500" height = "500" alt="Avatar" class="avatar" height="250" width="15">
    </div>
/*  this is for new users to enter there information to create an account */
    <div class="container">
      <label for="usr"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="usr" required>

      <label for="pwd"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="pwd" required>
      
      <label for="user_firstName"><b>First Name</b></label>
      <input type="text" placeholder="Enter First Name" name="user_firstName" required>
      
      <label for="user_lastName"><b>Last Name</b></label>
      <input type="text" placeholder="Enter Last Name" name="user_lastName" required>
         <label>
        <input type="checkbox" checked="checked" name="remember"> Remember Me
      </label>
      <button type="submit">Create Account</button>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">Password?</a></span>
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
	<div class="logo">
		<img
			src="https://pbs.twimg.com/profile_images/469176992873459712/d-SnkEzk_400x400.png"
			alt="CSBSJU Logo">
	</div>

	<!-- about this site element -->
	<div class="aboutThisSite">
		<a href="AboutThisSite.html">About This Site</a>
	</div>

</body>
</html>
