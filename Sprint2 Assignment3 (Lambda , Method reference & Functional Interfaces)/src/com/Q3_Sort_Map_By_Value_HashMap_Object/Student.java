package com.Q3_Sort_Map_By_Value_HashMap_Object;

import java.util.Objects;

public class Student {

	private int roll;
	private String name;
	private String email;
	private int marks;
	
	
	public Student(int roll, String name, String email, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public int getMarks() {
		return marks;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(email);
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
		return Objects.equals(email, other.email);
	}
		
	

	
}
