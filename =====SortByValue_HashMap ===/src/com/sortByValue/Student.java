package com.sortByValue;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private int roll;
	private String name;
	private int marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(marks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks ;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	@Override
	public int compareTo(Student o) {
		if(getMarks() > o.getMarks()) {
			return +1;
		}
		else if(getMarks() < o.getMarks()) {
			return -1;
		}
		
		return 0;

	}
	
	
	
}
