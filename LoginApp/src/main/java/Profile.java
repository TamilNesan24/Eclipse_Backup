import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Profile extends HttpServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		 HttpSession session=request.getSession();
		  ServletContext context=request.getServletContext();
	String name=(String) session.getAttribute("username");
	PrintWriter print=response.getWriter();
	String details1[]=(String[]) context.getAttribute(name);
	  response.setContentType("text/html");

	print.println(details1[0]+"<br>");
	print.println(details1[1]+"<br>");
	print.println(details1[2]+"<br>");
	print.println("<form action=\"/index.html\" method=\"get\"> \r\n");
	print.println("<input type=\"submit\" value=\"Logout\">  </form>\r\n" );
}


public void doPost(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException, ServletException 
	  {
	HttpSession session=request.getSession();
	  ServletContext context=request.getServletContext();
String name=(String) session.getAttribute("username");
	String details[]=new String[3];
	details[0]=request.getParameter("name");
	 details[1]=request.getParameter("age");
	 details[2]=request.getParameter("email");
	 	  context.setAttribute(name, details);
doGet(request,response);
	
	
	  }
}





//ServletContext context=request.getServletContext();
//String uname=request.getParameter("sname");
//if(context.getAttribute(uname).toString().equals(""))
//	{
//	 response.sendRedirect("details.html");
//	 }
//
//String details[]=new String[3];
// details[0]=request.getParameter("name");
// details[1]=request.getParameter("age");
// details[2]=request.getParameter("email");
// 	  context.setAttribute(uname, details);
//
//PrintWriter print=response.getWriter();
//String details1[]=(String[]) context.getAttribute("name");
//print.println(details1[0]+"<br>");
//print.println(details1[1]+"<br>");
//print.println(details1[2]+"<br>");
//print.println("<form action=\"/index.html\" method=\"get\"> \r\n");
//print.println("<input type=\"submit\" value=\"LOGOUT\">  \r\n" );