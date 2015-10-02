<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show All Offers</title>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<table class="offers">
		<tr>
			<td>Name</td>
			<td>Email</td>
			<td>Offer</td>
		</tr>

		<c:forEach var="offer" items="${offers}">
			<tr>

				<td><c:out value="${offer.name}"></c:out></td>

				<td><c:out value="${offer.email}"></c:out></td>

				<td><c:out value="${offer.text}"></c:out></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>