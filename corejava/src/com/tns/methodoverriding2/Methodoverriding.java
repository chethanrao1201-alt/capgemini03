package com.tns.methodoverriding2;
class Vehicle{
	void start() {
		System.out.println("vehicle is starting");
	}
}
class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("car starts with the key");
		
	}
	
}

class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("bike starts with self start");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		Vehicle v1=new Car();
		Vehicle v2=new Bike();
		
		v1.start();
		v2.start();

	}

}
