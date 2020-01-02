import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Palindrome extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{

	String str=req.getParameter("name");
	StringBuffer rev=new StringBuffer(str);
	String check=rev.reverse().toString();
	
	PrintWriter print=res.getWriter();
if(str.equals(check))
{
	
	ServletContext r=req.getServletContext();
	String r1=(String) r.getInitParameter("statement");
	print.println(r1);
	
	
	}
else
{
	print.print("Enter a Palindrome");  
	RequestDispatcher rd=req.getRequestDispatcher("second.html");  
	rd.include(req,res);
}
}
}