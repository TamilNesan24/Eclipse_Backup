package com.onlineShoppping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import javax.cache.Cache;
import javax.cache.CacheException;
import javax.cache.CacheFactory;
import javax.cache.CacheManager;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.test.Data;


@Controller
public class LoginController {
	static int total = 0; 

	@RequestMapping("/user")
	public @ResponseBody String dis()
	{
		System.out.println("hhmtl");
		return "NewFi";
	}
	
	
	@RequestMapping(value="/user1" ,produces="application/json")
	@ResponseBody
	public ArrayList<Data> Display3(Data data)
	{
			ModelAndView view = new ModelAndView();
			data.setId("12");
			data.setName("tamil");
			data.setPosition("none");
			ArrayList<Data> add= new ArrayList();
			add.add(data);
			view.addObject("msg",add);
			view.setViewName("display1");
			return add;
			}
	

	@RequestMapping(value = "/print",method = RequestMethod.POST  )
	public  @ResponseBody String Display1(@RequestBody String data) throws JsonMappingException, JsonProcessingException
	{
		System.out.println("in");
		ObjectMapper mapper=new ObjectMapper();
		Data obj=mapper.readValue(data,Data.class);
		System.out.println("here"+obj.getId());
		return "yes "+obj.getId();
	}
	
	@RequestMapping(value="/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String Display2(@RequestBody Data data)
	{ 
//		System.out.println("user and Json"+data.getId()+data.getName()+data.getPosition());
		System.out.println(data);
//			ModelAndView view = new ModelAndView("display1.jsp");
			return "k";
			}
	
		@RequestMapping(value="/verify",method=RequestMethod.POST )
	public @ResponseBody String verify(String name,String password)
	{
	System.out.println("in");
//        Key customerKey = KeyFactory.createKey("Customer", name);
            Entity customer = new Entity("Customer", name);
            customer.setProperty("name", name);
            customer.setProperty("password", password);
            DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
            datastore.put(customer);
   		 Cache cache = null;
   	      try {
   			CacheFactory cacheFactory = CacheManager.getInstance().getCacheFactory();
   			cache=cacheFactory.createCache(Collections.emptyMap());
   		} catch (CacheException e) {
   			e.printStackTrace();
   		}
   	      System.out.println(cache);
            return "yes";
	
	}
	
	@RequestMapping(value="/see",method=RequestMethod.GET )
	public @ResponseBody String display(String name,String password)
	{
	System.out.println("display");
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	Query q = new Query("Customer").addFilter("name", FilterOperator.EQUAL, name);
	PreparedQuery pq = datastore.prepare(q);
	Entity pquser = pq.asSingleEntity();
	String p = (String) pquser.getProperty("password");
	String n =(String) pquser.getProperty("name");
	System.out.println(p+n);
	System.out.println(pquser);
	HashMap map=new HashMap();
	 Cache cache = null;
     try {
		CacheFactory cacheFactory = CacheManager.getInstance().getCacheFactory();
		cache=cacheFactory.createCache(map);
	} catch (CacheException e) {
		e.printStackTrace();
	}
     System.out.println(cache.getCacheStatistics());
	return "validdated";
	
	}
	
	@RequestMapping(value="/addCount/{num}", method = RequestMethod.GET)
	public String addCount(@PathVariable int num, ModelMap model) {

		total += num; 
		model.addAttribute("total", total);

		return "forward:crons.jsp";
		
	}
	
	@RequestMapping(value="/count", method = RequestMethod.GET)
	public String getCount(ModelMap model) {

		model.addAttribute("total", total);
		
		return "forward:crons.jsp";

	}

}
