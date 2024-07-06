package net.javaguides.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

	
	@GetMapping("/home")
	public String  getMethod() {
		return "get Method call";
	}
	
	@PostMapping("/get")
	public String  postMethod() {
		return "Post Method call";
	}
}
