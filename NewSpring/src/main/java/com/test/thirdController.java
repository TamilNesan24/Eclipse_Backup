package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/full")
public class thirdController 
{
	@RequestMapping("/display")
	public ModelAndView display(String name,String password)
	{	
		System.out.println("8888"+name+password);
		ModelAndView modelAndview = new ModelAndView("NewDisplay.jsp");
		return modelAndview;
	}
	@RequestMapping("/{id}")
public  ModelAndView display1(@PathVariable int id)
{
		System.out.println("hi");

		System.out.print(id);
ModelAndView view=new ModelAndView();
return view;
}
	@RequestMapping("/")
	public  ModelAndView display2(@PathVariable int id)
	{
			System.out.println("hi");

			System.out.print(id);
	ModelAndView view=new ModelAndView();
	return view;
	}
	
	
}
