<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목적지 목록</title>
</head>
<body>
	<h1>목적지 목록</h1>
	
	<table border="1">
		<thead>
		<tr>
			<th>공항명</th>
			<th>설명</th>
			<th>국가명</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${destinations}" var="destination">
			<tr>
				<td>${destination.city}</td>
				<td>${destination.description}</td>
				<td>${destination.country}</td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>
</body>
</html>