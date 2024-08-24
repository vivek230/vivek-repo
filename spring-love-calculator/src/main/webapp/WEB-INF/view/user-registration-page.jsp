<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

</head>
<body>

<h1 align="center">Please register here</h1>

<form:form action="registration-success" method="GET" modelAttribute="userRegistrationDTO">

<div align="center">

<label>User: </label>
<form:input path="name"/>
<form:errors path="name" cssClass="error"/>
<br/>

<label>User Name: </label>
<form:input path="userName"/>
<form:errors path="userName" cssClass="error"/>
<br/>

<label>Password: </label>
<form:password path="password"/>
<br/>

<label>Country Name: </label>
<form:select path="countryName">
		<form:option value="IND" label="India"></form:option>
		<form:option value="USA" label="USA"></form:option>
		<form:option value="GER" label="Germany"></form:option>
		<form:option value="NOR" label="Norway"></form:option>
</form:select>
<br/>

<label>Hobbies: </label>
	Cricket <form:checkbox path="hobbies" value="Cricket"/>
	Reading <form:checkbox path="hobbies" value="Reading"/>
	Travelling <form:checkbox path="hobbies" value="Travelling"/>
	Programming <form:checkbox path="hobbies" value="Programming"/>
<br/>

<label>Gender: </label>
	Male <form:radiobutton path="gender" value="Male"/>
	Female <form:radiobutton path="gender" value="Female"/>
<br/>

<label>Age: </label>
	<form:input path="age"/>
	<form:errors path="age" cssClass="error"/>
<br/>

<div align="center">
	<h3>Communication</h3>
	
	<label>Email:</label>
	<form:input path="communicationDTO.email"/>
	<form:errors path="communicationDTO.email" cssClass="error"/>
	<br>
	
	<label>Phone:</label>
	<form:input path="communicationDTO.phone"/>
</div>

<br/>

<input type="submit" value="Register" />
</div>
</form:form>
</body>
</html>