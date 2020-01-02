<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Help.Data"%>
    
<!DOCTYPE html>
<html>
<head>
<style>
.container {
    width: 406px;
    max-width: 406px;
    margin: 0 auto;
}
</style>
</head>
<body>
<%

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(request.getParameter("lusername")==null)
	response.sendRedirect("Login.html");

%>
<%

String name=new String();
Data data=new Data();
if(request.getParameter("username")!=null)
{	
name=request.getParameter("username");
data=(Data)session.getAttribute(name);
out.println();

}
%>
<div class="container">

        <div class="header">
        
            <h2>HELLO <%= name.toUpperCase()+"!!"%></h3>
            
        </div>
        <br>
        <div>
        <h3>Your Salary is <%=  data.getSalary() %></h3>
        </div>
        <form action="Login.html"  >
        <input type="hidden" id="admin" name="user" value="<%=  data.getSalary() %>">
        <input type="submit" value="Home">
        </form>
        <div class="sep"></div>
</div>
</body>
</html>