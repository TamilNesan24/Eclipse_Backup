
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Test
		System.out.println(request.getParameter("method"));
		String param = (String) request.getAttribute("param");
		String url = request.getParameter("url");
		String urladd = new String();
		
		// ----------------------------//
		
		if (param != null) {
			urladd = url+"?" + param;
		}
		if (param == null) {
			urladd = url;
		}
		System.out.println(urladd);
		URL urlconnect = new URL(urladd);
		HttpURLConnection connect = (HttpURLConnection) urlconnect.openConnection();
		connect.setRequestMethod(request.getParameter("method"));
		System.out.println(connect.getContent());
		
		
		

		// -------------------------------//
       // Showing in the view part        //
 		response.setContentType("text/html");
//	response.getOutputStream().
		InputStream b = connect.getInputStream();
//		 connect.getContentLength();
		byte[] buffer = new byte[(b.available())];
	  b.read(buffer);
		response.setContentLength(buffer.length);
		response.getOutputStream().write(buffer);
		HttpSession s;

		// ----------------------------------//

//		  PrintWriter write=response.getWriter();
//		  write.print(new String(buffer));
//		  System.out.println("there"+new String(buffer));
//		  write.flush();
//		  write.close();
//		  write.print("yes");
//		  response.getOutputStream().write(buffer);
//		  b.close();
//		  response.getOutputStream().close();
//		response.getWriter().print("there");
//		  response.getOutputStream().flush();
//		  response.flushBuffer();
//		 request.getRequestDispatcher("/servlet3").forward(request, response);
//		  
//		BufferedReader in = new BufferedReader(new InputStreamReader(
//                connect.getInputStream()));
//String inputLine;
//while ((inputLine = in.readLine()) != null) 
//System.out.println(inputLine);
//in.close();

//		  b.close();
//		  response.getOutputStream().close();
	}

}
