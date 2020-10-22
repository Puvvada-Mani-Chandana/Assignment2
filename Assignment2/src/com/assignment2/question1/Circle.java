package com.assignment2.question1;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
}
