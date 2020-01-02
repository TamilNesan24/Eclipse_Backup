<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Help.Data" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
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
  background-color: #6699FF;
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
.header
{
color: #0000A0;
    
}
</style>
  </head>

  <body>
  <%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(request.getParameter("username")==null | request.getParameter("type")==null)
	{
	response.sendRedirect("Login.html");
	}
else
{
String type = request.getParameter("type");
if(type.equals("2"))
{
%>
  <div class="container">

    <form action="/admin" method="post">

        <div class="header">
        
            <h3>USER 1</h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
        
            Username:<br>
            <input type="text" placeholder="username" name="username1"/>
        <br>
        <br>
            Password:<br>
            <input type="password" placeholder="Password" name="password1" />
            <br>
            Salary:<br>
            <input type="text" name="salary1" >
            <br>
            <br>
        </div>
         <div class="header">
        
            <h3>USER 2</h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
        
            Username:<br>
            <input type="text" placeholder="username" name="username2"/>
        <br>
        <br>
            Password:<br>
            <input type="password" placeholder="Password" name="password2" />
            <br>
            Salary:<br>
            <input type="text" name="salary2" >
            <br>
            <br>
        </div>
         <div class="header">
        
            <h3>USER 3</h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
        
            Username:<br>
            <input type="text" placeholder="username" name="username3"/>
        <br>
        <br>
            Password:<br>
            <input type="password" placeholder="Password" name="password3" />
            <br>
            Salary:<br>
            <input type="text" name="salary3" >
            <br>
            <br>
            <input type="submit"  class="button1" value="CREATE NEW USER">
        
    </form>
    <form action="Edit.jsp"  >
        <input type="submit"  class="button1" id="admin" name="user" value="Edit" >
        </form>
        </div>
</div>
<%
}
else if(type.equals("1"))
{
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
<%
} 
}
%>
  </body>
     
</html>