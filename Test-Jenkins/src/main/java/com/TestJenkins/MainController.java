package com.TestJenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("main.do")
	public String main() {
		return "main";
	}
	
	@GetMapping("test.do")
	public String test() {
		return "test";
	}
}