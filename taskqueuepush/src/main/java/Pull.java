import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

public class Pull extends HttpServlet {


	  protected void service(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		  Queue queue = QueueFactory.getQueue("pullqueue-test");
		  queue.add(TaskOptions.Builder.withMethod(TaskOptions.Method.PULL).param("param", "pull param").tag("process"));
		  System.out.println("pull yes now");
		  response.sendRedirect("/lease");

}
}