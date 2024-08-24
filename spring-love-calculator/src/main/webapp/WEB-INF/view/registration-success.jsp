<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Your registration is successful</h1>
	<h2>The details entered are:</h2>
	Name: ${userRegistrationDTO.name}
	<br /> User Name: ${userRegistrationDTO.userName}
	<br /> Password: ${userRegistrationDTO.password}
	<br /> Country Name: ${userRegistrationDTO.countryName}
	<br /> Hobbies:
	<c:forEach var="temp" items="${userRegistrationDTO.hobbies}">
		${temp}
	</c:forEach>
	<br /> Gender: ${userRegistrationDTO.gender}
	<br /> Age: ${userRegistrationDTO.age}
	<br /> Email: ${userRegistrationDTO.communicationDTO.email}
	<br /> Phone: ${userRegistrationDTO.communicationDTO.phone}

</body>
</html>