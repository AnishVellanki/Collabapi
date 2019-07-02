package com.ani.Colllabapi.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	SessionFactory factory;
	
	public HomeController() {
		
		
	System.out.println("From HomeController");
	System.out.println(factory);
	}
	@RequestMapping("/testing")
	public String Test()
	{
		return "hello";
	}
	
}
