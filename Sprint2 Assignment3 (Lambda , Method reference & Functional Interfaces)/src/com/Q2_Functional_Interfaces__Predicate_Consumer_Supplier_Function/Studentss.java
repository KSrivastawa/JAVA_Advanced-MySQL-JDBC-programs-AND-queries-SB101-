package com.Q2_Functional_Interfaces__Predicate_Consumer_Supplier_Function;

class Studentss {

	private int roll;
	private String name;
	private int marks;
	
	
	public Studentss(int roll, String name, int marks) {
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
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	
}
