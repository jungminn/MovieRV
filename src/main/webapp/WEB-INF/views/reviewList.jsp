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
	<h1>게시판</h1>
	<table border="1">
		<thead>
			<tr>
				<th>reviewnum</th>
				<th>usermail</th>
				<th>username</th>
				<th>content</th>
				<th>star</th>
				<th>moviecd</th>
				<th>hitcount</th>
				<th>regdate</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
					<td>${item.reviewnum}</td>
					<td>${item.usermail}</td>
					<td>${item.username}</td>
					<td>${item.content}</td>
					<td>${item.star}</td>
					<td>${item.moviecd}</td>
					<td>${item.hitcount}</td>
					<td>${item.regdate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

