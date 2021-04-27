package com.multi.githubtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
	
	@RequestMapping("/hello")
	public String start() {
		return "hello";
	}

}
