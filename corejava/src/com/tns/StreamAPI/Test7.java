package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test7 {

	public static void main(String[] args) {
	 List<String> p1=Arrays.asList("chethan","shabu","dileep");
	 Optional<String> r=p1.stream().skip(2).findFirst();
	 System.out.println("names :"+r);

	}

}
