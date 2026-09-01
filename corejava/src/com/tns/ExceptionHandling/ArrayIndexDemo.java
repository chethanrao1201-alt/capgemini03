package com.tns.ExceptionHandling;

public class ArrayIndexDemo {

	public static void main(String[] args) {
		int marks[]= {80,70,50,90};
		try {
			System.out.println(marks[2]);
			System.out.println(marks[5]);
			System.out.println(marks[1]);
		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		System.out.println("program continuing.......");

	}

}
