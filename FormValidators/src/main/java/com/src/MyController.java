package com.src;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

	@RequestMapping("/reg")
	public String registration(Model m)
	{
		m.addAttribute("cust", new Customer());
		return "customerRegistration";
	}
	
	@RequestMapping("/registration")
	public String custregistration(@Valid @ModelAttribute("cust")Customer c,BindingResult br,Model m)
	{
		if(br.hasErrors())
		{
			return "customerRegistration";
		}
		else
		{
			m.addAttribute("customer", c);
			return "display";
		}
		
	}
}
