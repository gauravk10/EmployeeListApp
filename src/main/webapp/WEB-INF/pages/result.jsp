<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h1>Employee details are</h1>
	<c:choose>
		<c:when test="${!empty empList}">
			<table border="1" bgcolor="cyan">
				<tr>
					<th>sequence no</th>
					<th>emp no</th>
					<th>emp name</th>
					<th>emp desg</th>
					<th>emp salary</th>
					<th>emp deptno</th>
				</tr>
				<c:forEach var="emp" items="${empList}">
					<tr>
						<td>${emp.seqNo}</td>
						<td>${emp.empno}</td>
						<td>${emp.ename}</td>
						<td>${emp.job}</td>
						<td>${emp.sal}</td>
						<td>${emp.deptno}</td>
					</tr>
				</c:forEach>

			</table>
		</c:when>
		<c:otherwise>
			<h1>No data is available</h1>
		</c:otherwise>
	</c:choose>
	<br>
	<a href="home.htm">Home</a>
</body>
</html>