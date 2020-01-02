<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Crons</h1>
	
	<h2>Counts : ${total} </h2>	
		<h2>Counts : <%= request.getAttribute("total").toString() %> </h2>	
	
		
</body>
</html>