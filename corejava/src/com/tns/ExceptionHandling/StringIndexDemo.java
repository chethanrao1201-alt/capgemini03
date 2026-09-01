package com.tns.ExceptionHandling;

public class StringIndexDemo {

	public static void main(String[] args) {
		String name="java";
		try {
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(3));
			System.out.println(name.charAt(9));
			System.out.println("welcome to java");
		}
		catch (StringIndexOutOfBoundsException s) {
			System.out.println(s);
			System.out.println("program continuing.......");
		}

	}

}
