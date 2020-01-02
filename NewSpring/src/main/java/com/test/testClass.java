package com.test;


import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
@RequestMapping("/rest")
public class testClass {
	
	@RequestMapping("/path")
	public ModelAndView dis()
	{
		System.out.println("in1");
		ModelAndView v=new ModelAndView("display1.jsp");
		return v;
		
	}
	
	@RequestMapping("/path/{name}")
	public String print(@PathVariable String name)
	{
		System.out.println("in");
		return "Hello"+name;
	}
	
	
	
//	@RequestMapping("/{name}/{id}")
//	public String two(@PathVariable("id,name") String num,String name)
//	{
//		return "index"+num+name;
//	}

	
//	@RequestMapping("/body/{name}")
//	public String one(String name)
//	{
//		return name;
//	}
	

}
