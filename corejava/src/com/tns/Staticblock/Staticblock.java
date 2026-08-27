package com.tns.Staticblock;

public class Staticblock {
	static int employeecount;
	
	static {
		employeecount=100;
		System.out.println("employee system initialized");
	}

	public static void main(String[] args) {
		System.out.println("static employee system . .");
		System.out.println("employee ="+employeecount);

	}

}
