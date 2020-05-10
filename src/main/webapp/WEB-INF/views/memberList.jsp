<%@ page contentType="text/html; charset=euc-kr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>Member</title>
</head>
<body>
	<h1>FirstUpdateGitTest게시판</h1>
	<table border="1">
		<thead>
			<tr>
				<th>mail</th>
				<th>pwd</th>
				<th>name</th>
				<th>originalfile</th>
				<th>savefile</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
					<td>${item.usermail}</td>
					<td>${item.userpwd}</td>
					<td>${item.username}</td>
					<td>${item.originalfile}</td>
					<td>${item.savedfile}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

