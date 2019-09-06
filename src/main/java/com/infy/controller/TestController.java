package com.infy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/getDetails/{name}")
	public String getEmployee(@PathVariable String name) {
		System.out.println("Hello " + name);
		return "Hello " + name + ". This is my docker application";
	}

	@RequestMapping(value = "/checkNumber/{number}")
	public  String checkNumber(@PathVariable int number) {
		String result = null;
		int remainder = 0;
		remainder = number % 2;
		if (remainder == 0) {
			result = "even";
		} else {
			result = "odd";
		}
		return  result;
	}
}
