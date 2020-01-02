import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentResult extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name=(String) req.getAttribute("name");
		String regno= (String) req.getAttribute("regno");
		PrintWriter print= res.getWriter();
		print.println("MATHS = 90");
		print.println("ENGLISH = 90");
		print.println("SCIENCE = 90");
        RequestDispatcher dis=req.getRequestDispatcher("index.html");          
	}
	}
