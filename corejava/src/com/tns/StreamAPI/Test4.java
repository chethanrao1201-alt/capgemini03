package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<Integer> i=Arrays.asList(05,12,21,29,12,3,125,675,555,80,67,111);
		long count=i.stream().distinct().count();
		System.out.println("unique value:"+count);

	}

}
