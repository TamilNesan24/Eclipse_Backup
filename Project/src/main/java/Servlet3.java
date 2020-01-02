import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  Test
		String param = (String) request.getAttribute("param");
		String url = request.getParameter("url");
		
		

		// ----------------------------//
		System.out.println(url);
		URL urlconnect = new URL(url);
		HttpURLConnection connect = (HttpURLConnection) urlconnect.openConnection();
		connect.setRequestMethod(request.getParameter("method"));
		connect.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
       // Showing in the view part        //
// 		response.setContentType("application/x-www-form-urlencoded");
		response.setContentType("text/html");
		connect.setDoOutput(true);
		 DataOutputStream wr = new DataOutputStream(connect.getOutputStream());
         wr.writeBytes(param);
         connect.getOutputStream().close();
		InputStream b = connect.getInputStream();
		byte[] buffer = new byte[(b.available())];
		  b.read(buffer);
		  
		  
		response.setContentLength(buffer.length);
		OutputStream output=response.getOutputStream();
		output.write(buffer);
		output.flush();
		
	        

}
}