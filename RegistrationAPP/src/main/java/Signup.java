import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException 
		  { 
	response.sendRedirect("details.html");
		  }
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException, ServletException 
	  { 
HttpSession session = request.getSession();
//session.setMaxInactiveInterval(-1);
		  String name=request.getParameter("name");
			String Age=request.getParameter("age");
			String email=request.getParameter("email");
		  session.setAttribute("sname",name);
		  session.setAttribute("age",Age);
		  session.setAttribute("email",email);		  
		  
RequestDispatcher dispatch2= request.getRequestDispatcher("/profile");
dispatch2.forward(request, response);





		  
}
}