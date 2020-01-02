import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logout extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException 
	{

		Cookie delete=new Cookie("name","");  
		delete.setMaxAge(0);  
        response.addCookie(delete);  
          
        response.getWriter().print("you are successfully logged out!");  

}}
