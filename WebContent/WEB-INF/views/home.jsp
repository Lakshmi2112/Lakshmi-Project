<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page import="com.hcl.*"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>
	<h1>All requests page</h1>

	<table border="1" align="center">
		<tr bgcolor="00FF7F">
			<th><b>Request Id</b></th>
			<th><b>Contact Id</b></th>
			<th><b>Patient Id</b></th>
			<th><b>Patient Name</b></th>
			<th><b>Blood Group</b></th>
			<th><b>City</b></th>
			<th><b>Hospital Name</b></th>
			<th><b>Contact Name</b></th>
			<th><b>Contact Number</b></th>
		</tr>


		<%ArrayList<BloodRequests> requests = (ArrayList<BloodRequests>) request.getAttribute("requests"); 
        for(BloodRequests r:requests){%>
		<tr>
			<td><%=r.getId()%></td>
			<td><%=r.getContact_id()%></td>
			<td><%=r.getPatient_id()%></td>
			<td><%=r.getPatient_name()%></td>
			<td><%=r.getBlood_group()%></td>
			<td><%=r.getCity()%></td>
			<td><%=r.getHospital_name()%></td>
			<td><%=r.getContact_name()%></td>
			<td><%=r.getContact_number()%></td>
		</tr>
		<%}%>
	</table>
	<div class="a-container">
		<a href="${pageContext.request.contextPath}/request">Make a new
			request</a> <a href="${pageContext.request.contextPath}/donate">Donate
			blood</a>
	</div>
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

table {
	background-color: white;
	margin: 4rem;
}

td, th {
	border: 1px solid #ddd;
	padding: 8px;
}

tr: {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #ddd;
}

th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: black;
	text-transform: uppercase;
	color: white;
}

a {
	text-decoration: none;
	border: 1px solid black;
	color: white;
	background-color: #202a75;
	padding: 1rem;
	text-transform: uppercase;
	border-radius: 3px;
	margin: 3rem;
}

.a-container {
	align-items: center;
	text-align: center;
}
</style>
