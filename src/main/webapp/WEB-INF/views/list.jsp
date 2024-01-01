<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<thead>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Email</th>
                <th>Salary</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
            </thead>
            <thead>
            <c:forEach var="emp" items= "${emp}">
                <tr>
                    <td>${emp.name}</td>
                    <td>${emp.age}</td>
                    <td>${emp.email}</td>
                    <td>${emp.salary}</td>
                    <td><a href="delete?id=${emp.id}">delete</a></td>
                    <td><a href="getRegByid?id=${emp.id}">update</a></td>
                </tr>
            </c:forEach>
            </thead>
    </table>
	
</body>
</html>