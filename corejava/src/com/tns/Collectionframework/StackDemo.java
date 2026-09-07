package com.tns.Collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		
		s.push("car");
		s.push("bus");
		s.push("tempo");
		s.push("cat");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
	
		s.peek();
		System.out.println(s);
		
		s.pop();
		System.out.println(s);

	}

}
