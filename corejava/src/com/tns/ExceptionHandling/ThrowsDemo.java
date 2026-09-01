package com.tns.ExceptionHandling;

public class ThrowsDemo {
	static void calculate(int a,int b) throws ArithmeticException{
		int result=a/b;
		System.out.println("result"+result);
	}

	public static void main(String[] args) {
		
		try {
			calculate(10,0);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}

	}

}
