import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Profile extends HttpServlet {

	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {
		  
	  
String name=request.getParameter("uname");
response.getWriter().println("Hi"+name+"You are logged in using HIDDEN FORM FIELD");

}
}