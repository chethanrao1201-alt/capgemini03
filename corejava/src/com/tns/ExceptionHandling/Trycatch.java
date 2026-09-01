package com.tns.ExceptionHandling;

public class Trycatch {

	public static void main(String[] args) {
		System.out.println("good morning");
		int a=90;
		int b=0;
		System.out.println("welcome to java");
		
		try {
		System.out.println("result"+a/b);
		}
		catch(ArithmeticException r) {
			System.out.println(r);
		}
		System.out.println("hello word");

	}

}
