import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

String name=request.getParameter("userName");
response.getWriter().println(name+"You are logged in");
response.getWriter().println("<a href='welcome?uname="+name+"'>visit</a>");
  }
}