import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Signup extends HttpServlet {
HashMap<String,String> validate=new HashMap();

	  public void doPost(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException, ServletException 
	  {
		  String sname=request.getParameter("sname");
		  String password=request.getParameter("spassword");
		  ServletContext context=request.getServletContext();
		  response.setContentType("text/html");
PrintWriter print=response.getWriter(); 
if(validate.containsKey(sname))
{
	String check=validate.get(sname);
	if(check.equals(password))
	{
		if(context.getAttribute(sname)==null)
		response.sendRedirect("details.html");
		else
			response.sendRedirect("/profile");
			
	}	
	else 
	{
		print.println("Wrong Password");
		RequestDispatcher dispatch1=request.getRequestDispatcher("index.html");
		dispatch1.include(request, response);
	}
}
else
{
	print.println("Username Wrong or Signup First");
	RequestDispatcher dispatch=request.getRequestDispatcher("index.html");
	dispatch.include(request, response);
}
	  
	  }
	  
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException 
	  {
String name=request.getParameter("uname");
String password=request.getParameter("upassword");
HttpSession session=request.getSession();
session.setAttribute("username", name);
validate.put(name, password);
response.sendRedirect("index.html");
response.getw
		   
		  }
	}



