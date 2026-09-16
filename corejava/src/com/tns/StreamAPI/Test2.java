package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

//map+tolist
public class Test2 {

	public static void main(String[] args) {
		List<String> name=Arrays.asList("rahul","priya","manoj");
		List<String> uppername=name.stream().map(name->name.toUpperCase()).toList();
		System.out.println("upper case names :"+uppername);
		
		
		
	
	}

}
