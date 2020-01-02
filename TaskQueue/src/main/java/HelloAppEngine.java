import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;


public class HelloAppEngine extends HttpServlet {
	  protected void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		    String send = request.getParameter("test");
		    Queue queue = QueueFactory.getDefaultQueue();
//		    queue.add(TaskOptions.Builder.withUrl("/test").param("test", send));
	    response.getWriter().println("yes");
		  }

  }





/**
              adding a tag using tag which act as a filter
q.add(
	    TaskOptions.Builder.withMethod(TaskOptions.Method.PULL)
	        .payload(content.toString())
	        .tag("process".getBytes()));
	        
	        
	        
	        how to lease a task 
	        
	        // Lease only tasks tagged with "process"
List<TaskHandle> tasks =
    q.leaseTasksByTag(3600, TimeUnit.SECONDS, numberOfTasksToLease, "process");
// You can also specify a tag to lease via LeaseOptions passed to leaseTasks.



*/