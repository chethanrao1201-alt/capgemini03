package com.tns.Collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<>();
	
	l.add("google");
	l.add("youtube");
	l.add("github");
	l.add("java");
	l.add("python");
	System.out.println(l);
	
	l.addFirst("sql");
	System.out.println(l);
	l.addLast("postgresql");
	System.out.println(l);
	System.out.println("first"+l.peekFirst());
	System.out.println("removed"+l.pollFirst());
	System.out.println(l);

	}

}
