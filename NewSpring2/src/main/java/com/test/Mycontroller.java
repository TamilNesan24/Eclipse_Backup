package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller 
{
	@RequestMapping("/user")
public ModelAndView Display(Data data)
{
		System.out.println("Query");
		ModelAndView view = new ModelAndView();
		return view;
		}
	@RequestMapping(consumes="application/json")
	public ModelAndView Display1(Data data)
	{
		System.out.println("Json");

			ModelAndView view = new ModelAndView("display.jsp");
			return view;
			}
	
	@RequestMapping(value="/user" ,consumes="application/json" )
	public ModelAndView Display2(Data data)
	{
		System.out.println("user and Json");

			ModelAndView view = new ModelAndView("display.jsp");
			return view;
			}
	@RequestMapping("/{}" )
	public ModelAndView Display3(Data data)
	{
			ModelAndView view = new ModelAndView("display.jsp");
			return view;
			}
}
