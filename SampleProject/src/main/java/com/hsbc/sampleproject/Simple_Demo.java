package com.hsbc.sampleproject;

public class Simple_Demo {
	String color;
	double radius;

	public Simple_Demo(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor(String color) {
		return color;
	}

	public void circle(String color, double radius) {
		System.out.println("Circle constructor called");
		this.radius = radius;

	}

	public static void main(String args) {
		Simple_Demo simpledemo = new Simple_Demo("Red");
		simpledemo.getColor("Black");
		simpledemo.circle("blue", 0.5);

	}

}
