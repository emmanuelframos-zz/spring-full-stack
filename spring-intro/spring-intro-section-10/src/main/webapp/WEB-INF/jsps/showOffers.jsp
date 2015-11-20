<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>Show Offers</title>
</head>

<body>
	<h2>Show Offers</h2>
	
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Text</th>
		</tr>
		<c:forEach items="${offers}" var="offer" >
			<tr>
				<td>${offer.name}</td>
				<td>${offer.email}</td>
				<td>${offer.text}</td>
			</tr>
		</c:forEach>
	</table>
</body>

</html>
