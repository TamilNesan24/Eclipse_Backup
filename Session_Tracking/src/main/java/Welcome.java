import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome  extends HttpServlet {
public void service(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {
	 PrintWriter out=response.getWriter();  
     
    // request.getRequestDispatcher("link.html").include(request, response);  
//       HttpSession s=request.getSession();
     Cookie get[]=request.getCookies();  
     if(get!=null){  
      String name=get[0].getValue();  
     if(!name.equals("")||name!=null){  
        response.sendRedirect("welcome.html");
     }  
     }else{  
         out.print("Please login first");  
         request.getRequestDispatcher("login.html");
     }  
     out.close();  


}
}
