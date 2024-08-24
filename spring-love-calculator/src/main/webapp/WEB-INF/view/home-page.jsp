<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<script type="text/javascript">

	function validateUserName() {
		if (document.getElementById("yn").value.length < 3) {
			alert("Your name should have atleast one character");
			return false;
		} else {
			return true;
		}
	}
</script>

</head>
<body>


<h1 align="center">Love Calculator</h1>

<form:form action="process-homepage" method="get" modelAttribute="userInfo">
<div align="center">
<p>
<label for="yn">Your Name:</label>
<form:input type="text" id="yn" path="userName" />
<form:errors path="userName" cssClass="error"/>
</p>

<p>
<label for="cn">Crush Name:</label>
<form:input type="text" id="cn" path="crushName" />
<form:errors path="crushName" cssClass="error"/>
</p>

<p>
<form:checkbox path="termsAndConditions" id="check" />
<label>I agree that this is just for fun</label>
<form:errors path="termsAndConditions" cssClass="error"/>
</p>
<input type="submit" value="calculate">
</div>
</form:form>

</body>
</html>