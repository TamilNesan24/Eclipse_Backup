import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Vowel extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	String str=req.getParameter("name");
	PrintWriter out= res.getWriter();
	int count=0;
	for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
        	count++;
	}
	if(count>=1)
	{
	res.sendRedirect("second.html");
	}
	else
{
res.sendRedirect("index.html");
out.print("Sorry Enter number with vowels"); 

//RequestDispatcher rd=req.getRequestDispatcher("index.html");  
//rd.include(req,res);
}
}
}


