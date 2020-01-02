
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Help.Data;

public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		Integer count = (Integer) context.getAttribute("count");
		
       //  Saving the Edited value
		for (int i = 1; i < count; i++) {
			String user = request.getParameter(("username" + i));
			session.setAttribute(user,
					new Data(user, request.getParameter("password" + i), request.getParameter("salary" + i)));
			System.out.println(user + "     " + request.getParameter("password" + i) + "    "
					+ request.getParameter("salary" + i));
		}
		// Return to login page
		response.sendRedirect("Login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


        // Adding the data to session scope
		String name;
		HttpSession session = request.getSession();
		
		// User1
		name = request.getParameter("username1");
		session.setAttribute(name, new Data(name, request.getParameter("password1"), request.getParameter("salary1")));
		
		// User2
		name = request.getParameter("username2");
		session.setAttribute(name, new Data(name, request.getParameter("password2"), request.getParameter("salary2")));
		
		// User3
		name = request.getParameter("username3");
		session.setAttribute(name, new Data(name, request.getParameter("password3"), request.getParameter("salary3")));

		response.sendRedirect("Admin.html");
	}

}
