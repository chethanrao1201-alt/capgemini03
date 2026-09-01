package com.tns.ExceptionHandling;

public class NullIndexDemo {

	public static void main(String[] args) {
		String employeename="Rahul";
		String department=null;
		String designation="developer";
		
		try {
			System.out.println("employee"+employeename);
			System.out.println("designatio"+designation);
			System.out.println("department"+department.toUpperCase());
			
		}
		catch (NullPointerException n) {
			System.out.println("department info is missing....");
			System.out.println(n);
		}
		System.out.println("program is continuing.....");

	}

}
