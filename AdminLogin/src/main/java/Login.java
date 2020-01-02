import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Help.Data;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		/* getting the hidden form detail */
		String type = request.getParameter("type");
		
		HttpSession session = request.getSession();
		String username, password;
		response.setContentType("text/html");
		
		
		
		/* USER */
		if (type.equals("1")) {
			username = request.getParameter("username");
			password = request.getParameter("password");
			Data data = (Data) session.getAttribute(username);
			// Password validation
			if (password.equals(data.getPassword())) {
				request.getRequestDispatcher("Admin1.jsp").forward(request, response);
			} else {
				response.getWriter().println("Wrong Username or Password");
				request.getRequestDispatcher("Login.html").include(request, response);
			}

		}
		
		

		/* ADMIN */
		if (type.equals("2")) {
			username = request.getParameter("username");
			password = request.getParameter("password");

			// Password validation
			if (username.equals("admin") && password.equals("pass")) {
				request.getRequestDispatcher("Admin1.jsp").forward(request, response);
			} else {
				response.getWriter().println("Wrong Username or Password");
				request.getRequestDispatcher("Admin.html").include(request, response);
			}

		}

	}

}