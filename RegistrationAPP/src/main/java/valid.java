import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class valid extends HttpServlet {

	  public void service(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {
HttpSession session=request.getSession();
//if(session.getAttribute("sname")==null)
if(session.isNew())
{
response.sendRedirect("signup.html");
}
else
{
	response.sendRedirect("/profile");
	
}
}
	  }