import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskHandle;

public class LeaseTask extends HttpServlet {


	  protected void service(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		  Queue queue = QueueFactory.getQueue("pullqueue-test");
		  List<TaskHandle> lease = queue.leaseTasksByTag(60, TimeUnit.SECONDS, 1, "process");
		  System.out.println(request.getParameter("param"));
		  System.out.println(lease.isEmpty());
		  System.out.println(lease.get(0).getTag());
		  response.getWriter().println("pull");
//		  System.out.println(lease.get(0).getPayload().toString());
		
}

}