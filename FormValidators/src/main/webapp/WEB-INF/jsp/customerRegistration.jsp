<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color: red;
}
</style>
</head>
<body>
<form:form action="./registration" modelAttribute="cust">

Enter Customer id : <form:input path="custid"/><form:errors path="custid" cssClass="error"/><br>

Enter Customer name : <form:input path="custname"/><form:errors path="custname" cssClass="error"/><br>

Enter Customer address : <form:textarea path="custadd"/><form:errors path="custadd" cssClass="error"/><br>

Enter Customer mail : <form:input path="emailid"/><form:errors path="emailid" cssClass="error"/><br>

Enter Customer age : <form:input path="age"/><form:errors path="age" cssClass="error"/><br>

Enter Customer date of birth : <form:input path="dob"/><form:errors path="dob" cssClass="error"/><br>

Enter Customer fatherName : <form:input path="fatherName"/><form:errors path="fatherName" cssClass="error"/><br>

Enter Customer motherName : <form:input path="motherName"/><form:errors path="motherName" cssClass="error"/><br>

Enter Customer gender : <form:input path="gender"/><form:errors path="gender" cssClass="error"/><br>

Enter Customer mobile number : <form:input path="mobileno"/><form:errors path="mobileno" cssClass="error"/><br>

<input type="submit" value="register"/>
</form:form>
</body>
</html>