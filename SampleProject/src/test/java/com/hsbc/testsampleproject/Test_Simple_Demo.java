package com.hsbc.testsampleproject;

import org.junit.Test;

import com.hsbc.sampleproject.Simple_Demo;

public class Test_Simple_Demo {
	private  Simple_Demo simple;
	
	@Test
	public void testgetcolor(){
		String color="Black";
     simple.getColor("Black");
	}
	

	@Test
	public void testcircle(){
		String color="red";
		double radius=0.5;
		simple.circle(color, radius);
	}
	
	
}


