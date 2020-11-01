package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//need a controller method to read form data & add data to the model
	@RequestMapping("/processFormV2")
	public String processDataToUpperCase(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML Form
		String theName = request.getParameter("studentName");
		
		//convert data to upper case
		theName = theName.toUpperCase();
		
		//create the message
		String message = "Yo " + theName + "!!";
		
		//add message to the model
		model.addAttribute("message", message);
		
		return "helloworld";
	}
	
	//Read the request parameter from the HTML Form by @RequestParam Annotation
	@RequestMapping("/processFormV3")
	public String processDataByRequestParam(@RequestParam("studentName")String theName, Model model) {
		//convert data to upper case
		theName = theName.toUpperCase();
		
		//create the message
		String message = "Hey my friend from v3 - " + theName + "!!";
		
		//add message to the model
		model.addAttribute("message", message);
		
		return "helloworld";
	}
}
