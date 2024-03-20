package com.example.demosss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class lala {
    
	@RequestMapping("/")
	public String newjsp(Model model) {
		return "hello";
	}

}
