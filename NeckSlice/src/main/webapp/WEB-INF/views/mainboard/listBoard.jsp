<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
th, td {
	border: solid 1px black;
}
</style>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>제목</th>
			<th>내용</th>
			<th>조회</th>
			<th>최종수정</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${freeBoardList}" var="freeBoard">
		<tr>	
			<td><c:out value="${freeBoard.title}"></c:out></td>
			<td><c:out value="${freeBoard.contents}"></c:out></td>
			<td><c:out value="${freeBoard.hit}"></c:out></td>
			<c:choose>
				<c:when test="${empty freeBoard.updateDatetime}">
					<td><c:out value="${freeBoadrd.createDatetime}"></c:out></td>
				</c:when>
				<c:otherwise>
					<td><c:out value="${freeBoadrd.updateDatetime}"></c:out></td>
				</c:otherwise>
			</c:choose>
		</tr>
	</c:forEach>
	</tbody>
	<tfoot></tfoot>
</table>
</body>
</html>