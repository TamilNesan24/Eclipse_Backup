import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class valid extends HttpServlet {
HashMap logindata=new HashMap();

	  public void service(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {
String name=request.getParameter("name");
String password=request.getParameter("password");
	if(logindata.containsKey(name))
	{
    HttpSession session=request.getSession();
    session.setAttribute("name", name);   
    request.getRequestDispatcher("Welcome");
	}
else
{
	response.sendRedirect("signup.html");	
	String sname=request.getParameter("name");
	String spassword=request.getParameter("password");
logindata.put(sname, spassword);	
}


}
}