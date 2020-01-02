import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome  extends HttpServlet 
{
	Access access=new Access();

HashMap<String,Access> profilemap=new HashMap();
public void service(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	 PrintWriter out=response.getWriter();  
     
    // request.getRequestDispatcher("link.html").include(request, response);  
//       HttpSession s=request.getSession();
	 HttpSession session=request.getSession(false);  
     String name=(String) session.getAttribute("name");
     PrintWriter print=response.getWriter();
     if(profilemap.containsKey(name))
     {
    	 print.println(name);
    	 access=profilemap.get(name);
    	 print.println(access.getName());
    	 print.println(access.getAge());
    	 print.println(access.getEmail());
}
     else
     {
    	 response.sendRedirect("welcome.html");
access.setAge(request.getParameter("age"));
access.setEmail(request.getParameter("email"));
access.setName(request.getParameter("name"));
profilemap.put(name, access);
     }


}
}
