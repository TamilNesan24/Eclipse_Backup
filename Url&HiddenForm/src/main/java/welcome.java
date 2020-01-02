import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcome extends HttpServlet {

	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	String name=request.getParameter("uname");
	response.getWriter().println("Hi  "+name+" you are logged in using the url rewriting");
	PrintWriter print=response.getWriter();
	print.print("<form action='profile'>");  
	print.print("<input type='hidden' name='uname' value='"+name+"'>");  
	print.print("<input type='submit' value='go'>");  
	print.print("</form>");  

	  }


}
