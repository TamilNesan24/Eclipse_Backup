import java.io.IOException;
import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Profile  extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {

		
		
		String name=request.getParameter("name");
		String Age=request.getParameter("age");
		String email=request.getParameter("email");
		PrintWriter print=response.getWriter();
		print.println("name");
		print.println("age");
		print.println("email");


		
}
}
