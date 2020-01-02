import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentResult extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("name");
		String regno= req.getParameter("regno");
		PrintWriter print= res.getWriter();
		print.println( name  +"You scored not enough");
		print.println();
		print.println("MATHS = 90");
		print.println("ENGLISH = 90");
		print.println("SCIENCE = 90");
		
	}
	}
