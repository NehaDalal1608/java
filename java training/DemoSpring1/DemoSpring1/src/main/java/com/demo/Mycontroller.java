package com.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Mycontroller {
	@RequestMapping("/")
	public String print() {
		return "Welcome to spring boot world";
	}
	@RequestMapping("/home") 
		public String print2() {
			return "Welcome to spring boot world print2";
		}
	}
