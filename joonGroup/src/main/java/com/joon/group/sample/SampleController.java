package com.joon.group.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping("/home")
	public String sampleMethod(Model model){
		
		
		model.addAttribute("name", "지영");
		model.addAttribute("ggg", "준우꺼");
		
		return "home";
	}
	
}
