package com.tns.ExceptionHandling;

public class ThrowDemo2 {
	static void checkpassword(String Password) {
		if(Password.length()<6) {
			throw new IllegalArgumentException("Password is too short");
		}
		System.out.println("Password is Accepted");
	}
      
	public static void main(String[] args) {
		try {
			checkpassword("abcjchkutgif");
		}
		catch(IllegalArgumentException i) {
			System.out.println(i.getMessage());
		}

	}

}
