package com.tns.ComparableFunction;

public class String1Demo {

	public static void main(String[] args) {
		String s="hello java programming";
		System.out.println("length:"+s.length());
        System.out.println("character at the index:"+s.charAt(6));
        System.out.println("upper case:"+s.toUpperCase());
        System.out.println("lower case:"+s.toLowerCase());
        
        System.out.println("java");
        
        System.out.println(s.startsWith("word"));
        
        System.out.println(s.endsWith("hello"));
        
        System.out.println(s.substring(6,10));
        
        System.out.println(s.replace("java", "python"));
	}

}
