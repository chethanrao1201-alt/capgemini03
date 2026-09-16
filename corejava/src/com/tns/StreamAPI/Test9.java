package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Employee{
	private int id;
	private String name;
	

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
private String Department;
private double salary;
	
	
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		this.salary = salary;

}
}

public class Test9 {

	public static void main(String[] args) {
		List<Employee> e=Arrays.asList(new Employee(101,"jhon","IT",250000),
				                       new Employee(102,"cena","IT",200000),
                                       new Employee(102,"mark","HR",50000),
                                       new Employee(102,"kane","Data",10000),
                                       new Employee(102,"botham","IT",150000),
                                       new Employee(102,"cena","finanace",8000));
		List<String> r=e.stream().filter(Employee->Employee.getDepartment().equals("IT")).filter(Employee->Employee.getSalary()>50000)
				.map(Employee->Employee.getName()).sorted().toList();
		System.out.println(r);
		
		
	}

}
