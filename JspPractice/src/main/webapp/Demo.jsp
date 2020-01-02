<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String name="name";

application.setAttribute(name, "string");
request.setAttribute(name, "tamil");
response.setContentType("text/html");
session.setAttribute(name, "tamil");
out.println("tamil");
page.toString();
pageContext.setAttribute(name, "tamil",PageContext.SESSION_SCOPE);


%>
<%= "WELCOME"
%>


</body>
</html>