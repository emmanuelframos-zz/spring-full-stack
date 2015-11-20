<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href='<spring:url value="/resources/css/main.css"/>' />
	<title>Login</title>
</head>
<body>
	<h3>Login</h3>
	
	<c:if test="${param.error!=null}">
		<p class="error">An error ocurred, check that your login and username are correct.</p>
	</c:if>
	
	<form action="${pageContext.request.contextPath}/login"  method="POST">
		<table class="formtable">
			<tr>
				<td>User:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input class="control" name="submit" type="submit" value="Login"/></td>
			</tr>		
		</table>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
	</form>	
</body>
</html>