package com.tns.ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		try {
			System.out.println(6/0);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		finally {
			System.out.println("welcome to java");
		}

	}

}
