package com.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;


@Controller
@RequestMapping("/test")
public class SecondController 
{
	
	@RequestMapping(value = "/something", method = RequestMethod.GET )
	public String display(HttpServletRequest request, HttpServletResponse response)
	{	
		return "Somethig";
	}
	//pathvariable
	@RequestMapping("/display")
	// @RequestParam("name") is not reqired if param name is SAME AS the string name
	public ModelAndView display1( String name,String password)
	{	
		System.out.println("8888"+name+password);
		ModelAndView modelAndview = new ModelAndView("NewDisplay");
		return modelAndview;
	}
}
