<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student id : ${student.sid }<br>
Student Name : ${student.sname }<br>
Student Address : ${student.sadd }<br>
Gender : ${student.gender }<br>
Skills:
<ul>
	<c:forEach var="skills" items="${student.skills }">
		<li>${skills }</li>
	</c:forEach>
</ul>
<br>
Branch : ${student.branch }<br>
Year of Passing : ${student.yop }
</body>
</html>