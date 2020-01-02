import java.io.IOException;
import java.util.Collections;

import javax.cache.Cache;
import javax.cache.CacheException;
import javax.cache.CacheFactory;
import javax.cache.CacheManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test extends HttpServlet {


	  protected void service(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	    String text = request.getParameter("test");
	    System.out.println(text);
response.getWriter().println(text);
Cache cache = null;
   try {
		CacheFactory cacheFactory = CacheManager.getInstance().getCacheFactory();
		cache=cacheFactory.createCache(Collections.emptyMap());
	} catch (CacheException e) {
		e.printStackTrace();
	}
   System.out.println(cache);
	  }
	}