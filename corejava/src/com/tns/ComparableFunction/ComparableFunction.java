package com.tns.ComparableFunction;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		return this.marks-o.marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
}


public class ComparableFunction {

	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student (85,"rahul"));
		s.add(new Student (89,"jhon"));
		s.add(new Student (35,"cena"));
		s.add(new Student (95,"kane"));
	    Collections.sort(s);
	    System.out.println(s);

	}

}

