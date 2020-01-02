import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAppEngine {

  public void doGet(HttpServletRequest req, HttpServletResponse res) 
      throws IOException {


		String name1=req.getParameter("sn");
		String regno= req.getParameter("regno");
		res.sendRedirect("index.html");
		PrintWriter print= res.getWriter();
		print.println( name1 +"You scored not enough");
//		print.println();
//		print.println("MATHS = 60");
//		print.println();
//
//		print.println("ENGLISH = 70");
//		print.println();
//
//		print.println("SCIENCE = 80");
//		print.println("<br/><br/>");
//
//		print.println( "You scored not enough");


  }
}