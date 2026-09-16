package com.tns.Lambdaexpression;

import java.util.Scanner;

@FunctionalInterface
interface squaredemo{
	double calculate(int side);
}

public class SquareLambda {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter the values of sides");
     int sides=sc.nextInt();
     squaredemo square=(side)->{return sides*sides;};
     double result=square.calculate(sides);
     System.out.println("area of square"+result);
	}

}
