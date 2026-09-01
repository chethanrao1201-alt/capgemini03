package com.tns.ExceptionHandling;

public class Throwdemo {
	static void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("Student is not eligible for voting");
		}
		System.out.println("Student is eligible for vote");
	}

	public static void main(String[] args) {
		try {
			checkage(16);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		

	}

}
