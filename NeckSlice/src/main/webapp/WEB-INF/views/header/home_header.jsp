<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<meta id="_csrf" name="_csrf" content="${_csrf.token}"/>
	<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/> <!-- default header name is X-CSRF-TOKEN -->
	<title>J-WON</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1 style="text-align: center">Thanks for coming today!</h1>
			</div>
		</div>
		<div class="row" style="text-align: center">
			<div class="col"><a href="/">HOME</a></div>
			<div class="col"><a href="/mainboard/listBoard">BOARD</a></div>
			<sec:authorize access="isAnonymous()">
				<div class="col"><a href="/login/loginGet">LOGIN</a></div>
			</sec:authorize>
			<sec:authorize access="isAuthenticated()">
				<div class="col"><a href="#">LOGOUT</a></div>
			</sec:authorize>

		</div>
		<div class="row">

		</div>
	</div>
<script>

    // var token = $("meta[name='_csrf']").attr("content");
    // var header = $("meta[name='_csrf_header']").attr("content");
    // $(function() {
    //     $(document).ajaxSend(function(e, xhr, options) {
    //         xhr.setRequestHeader(header, token);
    //     });
    // });

</script>
</body>
</html>