<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<jsp:include page="../header/home_header.jsp" flush="false"></jsp:include>
	<br><br>
	<form id="loginForm" name="loginForm" method="POST" action="/login/loginPost">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<table>
			<tr>
				<td style="width:50px;">id</td>
				<td style="width:150px;">
					<input type="text" name="username" placeholder="USERNAME입력" value="mklmkl2001">
				</td>
			</tr>
			<tr>
				<td>pwd</td>
				<td>
					<input type="text" name="password" placeholder="PW입력">
				</td>
			</tr>
			<tr><td colspan="2"><input type="submit" id="btnLogin" value="로그인"></td></tr>
			<tr><td colspan="2"><input type="submit" id="btnSignup" value="회원가입"></td></tr>
		</table>
	</form>

	<script>
		// $("#login").on("click", function() {
        //
		// 	$.ajax({
		// 		url: '/login/loginPost',
		// 		type: 'POST',
		// 		contentType : 'application/json',		// 서버로 요청하는 데이터타입. 기본값은 "application/x-www-form-urlencoded"
		// 		dataType: 'json',						// 서버에서 반환되는 데이터타입.
		// 		data: JSON.stringify({"username": $("input[name='username']").val(), "password": $("input[name='password']").val()})
		// 	})
		// 	.done(function(response) {
		// 			window.location.href = response;
		// 	})
		// 	.fail(function() {
		// 			alert("ajax fail!");
		// 	});
		// });
	</script>
	<jsp:include page="../footer/home_footer.jsp" flush="false"></jsp:include>
</body>
</html>