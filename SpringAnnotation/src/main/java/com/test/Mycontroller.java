package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller 
{
	@RequestMapping("/display")
	public ModelAndView display(@RequestParam("name") String name)
	{
		 ModelAndView view =new ModelAndView();
		 view.setViewName("display");
		 view.addObject("name",name);
		 return view;
	}

}
