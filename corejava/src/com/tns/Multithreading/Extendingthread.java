package com.tns.Multithreading;

class Eclipse extends Thread{
	public void run() {
		System.out.println("eclipse id:"+""+Thread.currentThread().getId());
	}
}
	
	class Notebook extends Thread{
		public void run() {
			System.out.println("notebook id:"+""+Thread.currentThread().getId());
		}
	}
	
		class Chrome extends Thread{
			public void run() {
				System.out.println("Chrome id:"+""+Thread.currentThread().getId());
			}
	}
	


public class Extendingthread {

	public static void main(String[] args) {
		
	Eclipse e=new Eclipse();
	e.start();
 
	Notebook o=new Notebook();
	o.start();
	
	Chrome c=new Chrome();
	c.start();
	
	for (int i=0;i<=5;i++) {
		System.out.println("Main thread"+Thread.currentThread().getId());
	}
		

}
}
