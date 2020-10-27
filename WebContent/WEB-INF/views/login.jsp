<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>
	<h1>Login</h1>
	<form action="${pageContext.request.contextPath}/login" method="post">
		Name<input type="text" name="name" required><br> 
		Password<input type="password" name="password" required><br>

		<div class="centered">
			<button type="submit">Login</button>
			<br> <a href="${pageContext.request.contextPath}/register">Don't
				have an account? Register</a>
		</div>
	</form>
</body>
</html>

<style>
h1 {
	text-align: center;
	text-transform: uppercase;
}

body {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	background-color: #dedbff;
	border-width: 0px;
	width: 100%;
}

form {
	width: 400px;
	position: relative;
	left: 50%;
	transform: translate(-50%, 0%);
	background-color: white;
	padding: 5rem;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
}

.centered {
	text-align: center;
}

input[type=text], input[type=number], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

button[type=submit] {
	background-color: #202a75;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	text-transform: uppercase;
	text-align: center;
}

button[type=submit]:hover {
	background-color: #1f1964;
}

a {
	text-decoration: none;
	padding: 1rem;
}

.a-container {
	align-items: center;
	text-align: center;
}
</style>
