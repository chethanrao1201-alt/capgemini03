package com.tns.overloading2;

class Calculator{
	//circle
	double calculateArea(double radius) {
		return Math.PI*radius*radius;
	}
	//rectangle 
	double calculateArea(double length,double breadth,double height) {
		return length*breadth*height;
	}
	// square
	double calculateArea(int side) {
		return side*side;
}
}

public class Overloading {
	

	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		System.out.println("circle :"+c.calculateArea(5.0));
		System.out.println("rectangle :"+c.calculateArea(10.0,5.0,2.0));
		System.out.println("square :"+c.calculateArea(4));

	}

}
