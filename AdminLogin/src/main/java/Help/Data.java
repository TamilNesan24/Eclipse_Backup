package Help;

public class Data implements java.io.Serializable
{
	private String name;
	private String password;
	private String salary;
	public Data()
	{
		
	}
	public Data(String name,String password,String salary)
	{
		this.name=name;
		this.password=password;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
/*<%
for(count=1;name.hasMoreElements();count++)
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
            <input type="text" placeholder="username" name=<%="username"+count%> value="<%= username%>"/>
        <br>
        <br>
            Password:<br>
            <input type="text" placeholder="Password" name="<%="password"+count%>" value="<%= data.getPassword() %>" />
            <br>
            <br>
            Salary:<br>
            <input type="text" name="<%="salary"+count%>" value="<%= data.getSalary() %>" >
            <br>
            <br>
        </div>
         
            <br>
            <br>
             </div>
<%
}
%>
<% session.setAttribute("count", count); %>
*/
