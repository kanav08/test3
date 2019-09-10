package com.infy.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.infy.controller.TestController;

public class TestControllerTest {
int number=10;
TestController tc=new TestController();
	@Test
	public void checkNumberTest() {
		

		 assertEquals("even",tc.checkNumber(number)); 
		 System.out.println("Test executed sucessfully");
	}
	
}
