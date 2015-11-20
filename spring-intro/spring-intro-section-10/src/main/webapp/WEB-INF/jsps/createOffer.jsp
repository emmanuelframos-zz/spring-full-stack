<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<link rel="stylesheet" href='<spring:url value="/resources/css/main.css"/>' />
	<title>Create Offer</title>
</head>

<body>
	<h2>Create Offer</h2>

	<form method="post" action="${pageContext.request.contextPath}/saveOffer"> 
       	<table class="formtable">
			<tr>
				<td class="label">Name:</td>
				<td><input class="control" name="name" type="text"></td>
			</tr>
			<tr>
				<td class="label">Email:</td>
				<td><input class="control" name="email" type="text"></td>
			</tr>
			<tr>
				<td class="label">Your offer:</td>
				<td><textarea class="control" name="text" rows="10"></textarea></td>
			</tr>
			<tr>
				<td class="label"></td>
				<td><input class="control" value="Create Offer" type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>
