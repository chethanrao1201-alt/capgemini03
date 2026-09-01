package com.tns.ExceptionHandling;

public class ThrowsDemo2 {
	static void login(String username,String password) throws Exception{
		if(username.equals("admin")){
			throw new Exception("invalid username");
		}
		if(!password.equals("1234")) {
			throw new Exception("invalid password");
		}
		System.out.println("login successfully");
		
	}

	public static void main(String[] args) {
		try {
			login("admin","111");
		}
		catch(Exception c) {
			System.out.println(c.getMessage());
		}
		System.out.println("login process completed");

	}

}
