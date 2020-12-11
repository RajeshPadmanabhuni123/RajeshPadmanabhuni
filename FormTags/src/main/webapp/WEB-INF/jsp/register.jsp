<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="./regstud" modelAttribute="stud">
	
	Enter student id: <form:input path="sid"/><br>
	Enter student name: <form:input path="sname"/><br>
	Enter student address: <form:textarea path="sadd"/> <br>
	Gender:
	Male<form:radiobutton path="gender" value="male"/>
	Female<form:radiobutton path="gender" value="female"/><br>
	Skills:
	JAVA <form:checkbox path="skills" value="JAVA"/>
	Python <form:checkbox path="skills" value="python"/><br>
	Branch: <form:select path="branch">
		<form:option value="ECE"  label="ECE"/>
		<form:option value="EEE"  label="EEE"/>
		<form:option value="MECH"  label="MECH"/>
		<form:option value="CIVIL"  label="CIVIL"/>
	</form:select><br>
	Year of Passing : <form:hidden path="yop" value="2020"/><br>
	<input type="submit" value="register">
</form:form>
</body>
</html>



