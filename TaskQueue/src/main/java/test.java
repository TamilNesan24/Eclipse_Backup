import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test extends HttpServlet {


	  protected void service(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	    String text = request.getParameter("test");
response.getWriter().println("yes");
	   response.getWriter().println(text);
	  }
	}