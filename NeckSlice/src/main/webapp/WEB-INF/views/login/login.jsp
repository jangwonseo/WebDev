<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<style>
			input[type="button"] {
				margin:5px;
			}
		</style>
	</head>
	<body align="center">
		<br><br><br><br><br>
		<input type="text" name="username" placeholder="USERNAME입력" value="mklmkl2001">
		<input type="text" name="password" placeholder="PW입력">
		<br>
		<input id="login" type="button" value="LOGIN">
		<br>
		<input type="button" value="SIGNUP">
		
		<jsp:include page="./header.jsp" flush="false"></jsp:include>
		<script>
			$("#login").on("click", function() {
				
				$.ajax({
		            url: '/login/loginPost',
		            type: 'POST',
		            contentType : 'application/json',		// 서버로 요청하는 데이터타입. 기본값은 "application/x-www-form-urlencoded"
		            dataType: 'json',						// 서버에서 반환되는 데이터타입.
		            data: JSON.stringify({"username": $("input[name='username']").val(), "password": $("input[name='password']").val()})
		        })
		        .done(function(response) {
		        		window.location.href = response;
		        })
		        .fail(function() {
		        		alert("ajax fail!");
		        });
			});
		</script>
	</body>
</html>