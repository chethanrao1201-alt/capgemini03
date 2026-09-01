package com.tns.ExceptionHandling;

public class Demotrycatch {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException n) {
			System.out.println(n);
		}
		

	}

}
