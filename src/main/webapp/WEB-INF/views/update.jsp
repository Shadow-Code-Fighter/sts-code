<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<h1>Update Page</h1>
<c:if test="${not empty emp}">

    <form action="updateReg" method="post">
    	<table border="1">
        <tr>
        <th><label> ID:</label></th>
        <th><input type="hidden" name="id" value="${emp.id}" readonly="readonly"><br></th>

        <th><label >First Name: Update</label></th>
        <th><input type="text" name="name" value="${emp.name}" ><br></th>
        
        <th><label>Last Name:</label></th>
        <th><input type="text" name="age" value="${emp.age}"><br></th>
        
        <th><label>Mobile:</label></th>
        <th><input type="text" name="email" value="${emp.email}"readonly="readonly"><br></th>
        
        <th><label>Email:</label></th>
        <th><input type="text" name="salary" value="${emp.salary}"readonly="readonly"><br></th>
        <!-- Add more fields as needed -->
		</tr>
		</table><br>
        <input type="submit" value="Update Registration">
        
        
    </form>
    
</c:if>
</body>
</html>