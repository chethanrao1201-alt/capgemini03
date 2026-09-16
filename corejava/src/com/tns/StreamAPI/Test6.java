package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,12,15,18,25,30);
		l.stream().filter(n->n%5==0).forEach(System.out::println);

	}

}
