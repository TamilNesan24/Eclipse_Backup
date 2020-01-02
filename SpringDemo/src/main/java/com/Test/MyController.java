package com.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/display")
	public void display()
	{
		System.out.println("Hibbbbbbbbbbbbbbbbbbbbbbbbbb");
		
	}
}
 