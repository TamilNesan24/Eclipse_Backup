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

		HttpSession session =request.getSession();
//		session.setMaxInactiveInterval(-1);
		session.invalidate();
        response.getWriter().print("You are successfully logged out!");  
}}
