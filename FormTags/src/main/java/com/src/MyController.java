package com.src;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/register")
	public String display(Model m)
	{
		Student s=new Student();
		m.addAttribute("stud", s);
		return "register";
	}
	
	@RequestMapping("/regstud")
	public String display1(@ModelAttribute("stud")Student s,Model m)
	{
		m.addAttribute("student",s);
		return "display";
	}
}
