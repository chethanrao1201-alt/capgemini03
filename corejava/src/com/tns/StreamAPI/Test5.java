package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<String> p=Arrays.asList("laptop","mobile","tablet","lipstick","keyboard");
		List<String> result=p.stream().limit(3).toList();
		System.out.println("products names:"+result);

	}

}
