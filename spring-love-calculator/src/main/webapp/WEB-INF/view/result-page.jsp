<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Love Calculator</h1>
<hr>

<p>The Love Calculator predicts:</p>
	${userInfo.userName} and ${userInfo.crushName} are:
	<br/>
	FRIENDS
	<br/>
	
	<a href="/spring-love-calculator/sendEmail">Send result to your email</a>
</body>
</html>