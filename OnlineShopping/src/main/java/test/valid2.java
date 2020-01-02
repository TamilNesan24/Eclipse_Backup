package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;

@Controller
public class valid2 
{
	@RequestMapping(value="display")
	public  String dis()
	{
		System.out.print("in");
		return"works";
	}

	@RequestMapping(value="/di")
	public @ResponseBody String Validation ()
	{
		System.out.println("display");
		return "validdated";		
	}



@RequestMapping(value="/verify",method=RequestMethod.POST )
public @ResponseBody String verify(String name,String password)
{
System.out.println("in");
////    Key customerKey = KeyFactory.createKey("Customer", name);
     Entity customer = new Entity("Customer", name);
        customer.setProperty("name", name);
        customer.setProperty("email", password);
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        datastore.put(customer);
        String result = "tempResult!";
        return result ;
	
	
	
//	----------\
	
//	System.out.println("display");
//    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
//	Query q = new Query("user_old").addFilter("name", FilterOperator.EQUAL, name);
//	PreparedQuery pq = datastore.prepare(q);
//	Entity pquser = pq.asSingleEntity();
//	System.out.println(pquser);
//	return "validdated";
//	

}

}