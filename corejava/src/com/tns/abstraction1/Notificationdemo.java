package com.tns.abstraction1;


abstract class Anime{
	 abstract void sendmessage(String message);
		 
}
	 
	 class Pokemon extends Anime{

		@Override
		void sendmessage(String message) {
			System.out.println("animal based anime");
			int age=16;
			System.out.println("you can watch below age "+age);
		 
			
		}	
		 
	 }
		
		class Ninja extends Anime{

			@Override
			void sendmessage(String message) {
			System.out.println("fighthing based anime");
			int age=18;
			System.out.println("adult anime "+age);
				
			}
		
		
		
			
		
}
	 

public class Notificationdemo {
	

	public static void main(String[] args) {
	
	Pokemon p=new Pokemon();
	p.sendmessage("for childrens");
	System.out.println("for children"+p);
	
	Ninja n=new Ninja();
	n.sendmessage("for adult");
	System.out.println("this is for adult"+n);

	}
}


