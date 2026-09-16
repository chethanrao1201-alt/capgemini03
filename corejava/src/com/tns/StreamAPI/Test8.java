package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(30000,6000,800000,300,1205,58878,19808);
		boolean r=s.stream().filter(salary->salary>10000).anyMatch(salary->salary>100000);
		System.out.println("salary found :"+r);

	}

}
