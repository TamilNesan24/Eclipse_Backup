<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Help.Data" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>  
<%
Data data=(Data)application.getAttribute("userData");
%>
<%=
data.getUrl()
%>
<br>
<%=
data.getMethod()
%><br>
<%=
data.getData()
%><br></br>


</body>
</html>