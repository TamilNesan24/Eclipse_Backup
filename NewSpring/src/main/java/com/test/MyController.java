package com.test;


import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@Controller
public class MyController 
{
	@RequestMapping("/user")
	public @ResponseBody String dis()
	{
		System.out.println("hhmtl");
		return "NewFile.html";
	}
	
	
	@RequestMapping("/name")
public ModelAndView Display(Data data)
{
		System.out.println("Query");
		ModelAndView view = new ModelAndView("display1.jsp");
		return view;
		}
	
	@RequestMapping(value = "/print",method = RequestMethod.POST ,consumes={MediaType.APPLICATION_JSON_VALUE,"application/json"})
	public @ResponseBody String Display1(@RequestBody String data)
	{
		System.out.println("here"+data.toString());
		

		return data.toString();
	}
	
	@RequestMapping(value="/user", consumes= {MediaType.APPLICATION_JSON_VALUE,"application/json"})
	public ModelAndView Display2(@RequestBody Data data)
	{
		System.out.println("user and Json"+data.getId()+data.getName()+data.getPosition());

			ModelAndView view = new ModelAndView("display1.jsp");
			return view;
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
	@RequestMapping("/display")
	@ResponseBody
	public String verify(String name,String password)
	{
	System.out.println("in");
//        Key customerKey = KeyFactory.createKey("Customer", name);
            Entity customer = new Entity("Customer", "TamilID");
            customer.setProperty("name", name);
            customer.setProperty("password", password);
            DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
            datastore.put(customer);
            return "yes";
	
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public String search(String name,String password)
	{
		return "g";
	}
	
	
	
}
