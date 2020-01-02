import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class crons extends HttpServlet {
	static int total=1;

	  @Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException, ServletException {

		total ++;
		request.setAttribute("total", total);
		request.getRequestDispatcher("crons.jsp").forward(request, response);

	}
}
