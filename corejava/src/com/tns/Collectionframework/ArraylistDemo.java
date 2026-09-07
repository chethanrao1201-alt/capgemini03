package com.tns.Collectionframework;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList<String> p=new ArrayList<>();
		
		p.add("Laptop");
		p.add(null);
		p.add("mobiles");
		p.add("Headphones");
		p.add("Headphones");
		p.add("Headphones");
		p.add("Headphones");
		p.add("Headphones");
		System.out.println(p);
		System.out.println("product 1:"+p.get(1));
		System.out.println("contains mobile ?"+p.contains("mobiles"));
		System.out.println(p.size());
		p.remove("Headphones");
		System.out.println(p);
		for(String i:p) {
			System.out.println(i);
		}

	}

}
