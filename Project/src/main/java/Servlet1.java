import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");
		request.getParameter("name");
		
	
//		   converting to query format
//		   url?name1=value1&name2=value2&??
		   
		
		String param=new String ();
		System.out.println("yes");
		if(!request.getParameter("key").isEmpty()&&!request.getParameter("value").isEmpty())
		{
			param=param.concat(request.getParameter("key")).concat("=").concat(request.getParameter("value"));
		}
		if(!request.getParameter("key1").isEmpty()&&!request.getParameter("value1").isEmpty())
		{
			param=param.concat("&").concat(request.getParameter("key1")).concat("=").concat(request.getParameter("value1"));
		}
        request.setAttribute("param",param);
		if(request.getParameter("method").equals("GET"))
		request.getRequestDispatcher("/servlet2").forward(request, response);
		if(request.getParameter("method").equals("POST"))
			request.getRequestDispatcher("/servlet3").forward(request, response);

		

	}
	
	      //      Check  
	
//	System.out.println(request.getParameter("url")+"  "+request.getParameter("method"));
//	System.out.println(request.getParameter("key")+request.getParameter("key1"));
//	System.out.println(request.getParameter("value")+request.getParameter("value1"));
//	System.out.println(request.getParameter("url")+param);
}