package com.Q4_CollectionSet_FilteredByMarks;

import java.util.Objects;

public class StudentStream {

	private int roll;
	private String name;
	private int marks;
	
	public StudentStream(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentStream other = (StudentStream) obj;
		return roll == other.roll;
	}

	
	@Override
	public String toString() {
		return "StudentStream [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
