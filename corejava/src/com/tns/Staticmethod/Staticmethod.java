package com.tns.Staticmethod;


public class Staticmethod {
	static int calculatebonus(int salary){
		return salary*10/100;
		
	}

	public static void main(String[] args) {
		int bonus=Staticmethod.calculatebonus(30000);
		System.out.println("bonus ="+bonus);

	}

}
