package com.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.*;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class MyController{

	@RequestMapping("/display")
	public String display1()
	{
		return "NewDisplay.jsp";
		
	}
}
 