<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request</title>
</head>
<body>
	<a id="dbtn" href="${pageContext.request.contextPath}/dashboard">Go
		to dashboard</a>

	<h1>Make a blood request</h1>
	<form action="${pageContext.request.contextPath}/request" method="post">
		Contact Id<input type="number" name="contact_id" required><br>
		Patient Id<input type="number" name="patient_id" required><br>
		Patient Name<input type="text" name="patient_name" required><br>
		Blood Group<input type="text" name="blood_group" required><br>
		City<input type="text" name="city" required><br> Hospital
		Name<input type="text" name="hospital_name" required><br>
		Contact Name<input type="text" name="contact_name" required><br>
		Contact Number<input type="text" name="contact_number " required><br>
		<button type="submit">Request</button>
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

#dbtn {
	background-color: #202a75;
	color: white;
	padding: 14px 20px;
	margin: 3rem;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	text-transform: uppercase;
	text-align: center;
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
