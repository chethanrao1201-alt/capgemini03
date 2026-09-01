package com.tns.ExceptionHandling;

import javax.crypto.AEADBadTagException;

public class ArithmeticDemo {

	public static void main(String[] args) {
	
		int salary=50000;
		int workingdays=25;
		int bonusdays=5;
		
		try {
			int dailysalary=salary/workingdays;
			System.out.println(" dailysalary"+ dailysalary);
			
			int bonusperday=salary/0;
			System.out.println(" bonusperday"+(bonusperday*bonusdays));
			
		}
		catch(ArithmeticException a) {
			System.out.println("cannot calculate the bonus");
			System.out.println(a);
		}
		System.out.println("salary processing continue...");

	}

}
