<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Retrieving Students</title>
</head>
<body>
    <h2>Welcome to Spring Boot with JSP</h2>
    
    
<c:forEach var ="student" items="${students}"> 

	${student}
	<br/>
	
</c:forEach>
    
</body>
</html>
