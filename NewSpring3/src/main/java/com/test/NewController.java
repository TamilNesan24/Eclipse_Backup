package com.test;

import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewController {
	
	@RequestMapping("/body")
	public String print()
	{
		
		System.out.println("in");
//		ModelAndView v=new ModelAndView();
//		v.setViewName("NewFile.html");
		return "NewFile";
	}
	
	
	@RequestMapping("/{name}")
	public String print(@PathVariable String name)
	{
		return "Hello"+name;
	}
	@RequestMapping("/{name}/{id}")
	public String two(@PathVariable("id,name") String num,String name)
	{
		return "index"+num+name;
	}

	
//	@RequestMapping("/body/{name}")
//	public String one(String name)
//	{
//		return name;
//	}
	

}
