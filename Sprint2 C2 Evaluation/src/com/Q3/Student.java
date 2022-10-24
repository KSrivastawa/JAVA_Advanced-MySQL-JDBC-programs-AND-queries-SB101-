package com.Q3;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private String address;
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getAddress() {
		return address;
	}
	
	public Student(int roll, String name, int marks, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	
	
}
