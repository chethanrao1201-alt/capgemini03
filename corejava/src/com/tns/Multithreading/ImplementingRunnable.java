package com.tns.Multithreading;



class Whatps implements Runnable{

	@Override
	public void run() { 
	for(int i=0;i<5;i++) {
		System.out.println("Eclipse id "+" "+Thread.currentThread().getId());
	}
		
	}	
}


public class ImplementingRunnable {

	private static Runnable w;

	public static void main(String[] args) {
		
	    Thread obj=new Thread(w);  
	    obj.start();             
	    System.out.println("Main id"+" "+Thread.currentThread().getId());
	}
	}
