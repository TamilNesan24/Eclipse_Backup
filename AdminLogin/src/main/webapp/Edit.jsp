<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Enumeration" import="Help.Data"
    %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
.button {
  background-color: #4CAF50; //#ADD8E6
  border: none;
  color: white;
  padding: 15px 32px;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.button1 {
  background-color: #808080 ;//#ADD8E6;
  border: none;
  color: white;
  padding: 15px 32px;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.container {
    width: 406px;
    max-width: 406px;
    margin: 0 auto;
}
.sep {
    height: 0.5px;
    background: #e8e8e8;
    width: 406px;
    margin: 0px -25px;
}

.inputs {
    margin-top: 25px;
}
.inputs input[type=text], input[type=password] ,input[type=text]{
    background: #f5f5f5;
    font-size: 0.8rem;
    -moz-border-radius: 3px;
    -webkit-border-radius: 3px;
    border-radius: 3px;
    border: none;
    padding: 13px 10px;
    width: 330px;
    margin-bottom: 20px;
    box-shadow: inset 0px 2px 3px rgba( 0,0,0,0.1 );
    clear: both;
}
</style>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(request.getParameter("username")==null)
	{
	response.sendRedirect("Login.html");
	}

Integer count= new Integer(1);
String username=new String();

Enumeration<String> name=session.getAttributeNames();
%>
<%
for(;name.hasMoreElements();count++)
{
	username=name.nextElement();
    Data data=(Data)session.getAttribute(username);
	%>
	
	<div class="container">

    <form action="/admin" method="get">

        <div class="header">
        
            <h3>USER <%= username.toUpperCase() %></h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
        
            Username:<br>
            <input type="text" placeholder="username" name="<%=("username"+count)%>" value="<%= username %>" />
        <br>
        <br>
            Password:<br>
            <input type="text" placeholder="Password" name="<%=("password"+count)%>" value="<%= data.getPassword() %>" />
            <br>
            <br>
            Salary:<br>
            <input type="text" name="<%=("salary"+count)%>" value="<%= data.getSalary() %>" />
            <br>
            <br>
        </div>
         
            <br>
            <br>
          
<%
}
application.setAttribute("count",count);
%>

<input type="submit"  class="button1" value="Edit">
          </div>
    </form>
</div>
</body>
</html>