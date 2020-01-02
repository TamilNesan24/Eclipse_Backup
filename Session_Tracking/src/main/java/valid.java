import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class valid extends HttpServlet {

	  public void service(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {
String name=request.getParameter("name");
String password=request.getParameter("password");

if(name.equals("tamil")&&password.equals("1234"))
{
	Cookie track=new Cookie("name",name);  
	int i=7;
    response.addCookie(track); 
    response.sendRedirect("/welcome");
    HttpSession session=request.getSession();
    request.setAttribute(name,"string");
}
else
{
	response.sendRedirect("login.html");
	
	}


}
}