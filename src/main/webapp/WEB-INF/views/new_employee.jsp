<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Registration</h2>
<form action="saveEmployee" method="post">
	<pre>
		Name <input type="text" name="name"/>
		Age <input type="text" name="age"/>
		Email <input type="text" name="email"/>
		Salary <input type="text" name="salary"/>
				<input type="submit" value="save"/>
	</pre>
</form>
${msg}
</body>
</html>