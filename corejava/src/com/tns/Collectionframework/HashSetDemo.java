package com.tns.Collectionframework;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> javateam=new HashSet<>();
		
		 javateam.add("java");
		 javateam.add("sql");
		 javateam.add("git");
		 javateam.add("spring");
		 javateam.add("docker");
		 javateam.add(null);
		 
		 
		 System.out.println(javateam);
		
		
		HashSet<String> pythonteam=new HashSet<>();
		pythonteam.add("python");
		pythonteam.add("sql");
		pythonteam.add("git");
		pythonteam.add("Aws");
		
		System.out.println(pythonteam);
		
		
		HashSet<String> common=(HashSet<String>) javateam.clone();
		 System.out.println(common);
		 
		 common.retainAll(pythonteam);
		 System.out.println("common skills :"+common);
		 
		HashSet<String> onlyjava=(HashSet<String>) javateam.clone();
		System.out.println(onlyjava);
		

	}

}
