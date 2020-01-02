import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Profile extends HttpServlet {

	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException, ServletException 
	  { 

		  String userName=request.getParameter("sname");
		 HttpSession session= request.getSession();
			PrintWriter print=response.getWriter();
			response.setContentType("text/html");
			print.println(session.getAttribute("sname")+"<br>");
			print.println(session.getAttribute("age")+"<br>");
			print.println(session.getAttribute("email")+"<br>");
print.println("<form action=\"/Hello.html\" method=\"post\"> \r\n");
print.println("<input type=\"submit\" value=\"GO BACK\"> </form> \r\n" );
print.println("<form action=\"/profile\" method=\"post\"> \r\n");
print.println("<input type=\"submit\" value=\"LOGOUT\"> </form> \r\n" );
}
	  public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException 
		  { 
		  HttpSession session=request.getSession();
		  session.invalidate();
		  response.sendRedirect("signup.html");
		  }	  
}