<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
</head>
<body>
	<div class="container">
		<img src="https://wallpapercave.com/wp/wp4323464.jpg">
		<div class="centered">
			<div class="w-c">
				<h1>"Donate blood, Save Life "</h1>
				<h3>A single donation can save three lives. One blood donation
					provides different blood components that can help up to three
					different people. Blood cannot be manufactured. Despite medical and
					technological advances, blood cannot be made, so donations are the
					only way we can give blood to those who need it.</h3>
			</div>
			<div class="d-container">
				<a href="${pageContext.request.contextPath}/home">See all blood
					requests</a><br> <a
					href="${pageContext.request.contextPath}/getmyrequests?id=<%= request.getAttribute("id")%>">See
					my blood requests</a><br> <a
					href="${pageContext.request.contextPath}/getmydonations?id=<%= request.getAttribute("id")%>">See
					my blood donations</a><br> <a
					href="${pageContext.request.contextPath}/approval">Go to
					approval page</a><br> <a
					href="${pageContext.request.contextPath}/">Logout</a>
			</div>
			<h4>
				Your ID is
				<%=request.getAttribute("id")%></h4>

		</div>
	</div>
</body>
</html>

<style>
.container {
	position: relative;
	text-align: center;
	color: white;
}

.centered {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

img {
	width: 100%;
}

.w-c {
	width: 100%;
	position: relative;
	left: 50%;
	transform: translate(-50%, 0%);
}

h1 {
	text-shadow: 0 0 1px #FF0000, 0 0 3px #0000FF;
	font-size: 3rem;
}

h1 {
	text-align: center;
	color: white;
}

h3 {
	text-align: center;
	color: white;
}

body {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	background-color: #dedbff;
	border-width: 0px;
	width: 100%;
	text-align: center;
}

.d-container {
	width: 400px;
	position: relative;
	left: 50%;
	transform: translate(-50%, 0%);
	padding: 5rem;
}

.centered {
	text-align: center;
}

a {
	text-decoration: none;
	text-transform: uppercase;
	color: white;
}

.a-container {
	text-align: center;
}
</style>
