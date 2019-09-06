package com.infy.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.infy.controller.TestController;

public class TestControllerTest {
int number=10;
	@Test
	public void checkNumberTest() {
		
		TestController tc=new TestController();
		 assertEquals("even",tc.checkNumber(number));  
	}
}
