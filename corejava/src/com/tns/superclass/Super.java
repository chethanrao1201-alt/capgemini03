package com.tns.superclass;

class Employee {
	int salary=50000;
}
class Senioremployee extends Employee{
	int salary=80000;
	 
	void displayinfo() {
		System.out.println("Senioremployee salary"+salary);
		System.out.println("employee salary"+super.salary);

	}
}
public class Super {
	public static void main(String[] args) {
		Senioremployee n=new Senioremployee();
		n.displayinfo();
	}

}
