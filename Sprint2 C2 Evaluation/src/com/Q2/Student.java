package com.Q2;

public class Student {

	private int roll;
	private String name;
	private int marks;
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}
