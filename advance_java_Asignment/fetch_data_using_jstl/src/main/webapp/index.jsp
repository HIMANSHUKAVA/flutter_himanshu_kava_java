<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Table</title>
</head>
<body>


	<sql:setDataSource var="ds" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/servelet"
		user="root" password="" />


	<sql:query dataSource="${ds}" var="result">
		SELECT * FROM stab
	</sql:query>


	<table border="1" cellpadding="10">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Mobail</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="s" items="${result.rows}">
				<tr>
					<td>${s.id}</td>
					<td>${s.name}</td>
					<td>${s.mobail}</td>
					<td>${s.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
