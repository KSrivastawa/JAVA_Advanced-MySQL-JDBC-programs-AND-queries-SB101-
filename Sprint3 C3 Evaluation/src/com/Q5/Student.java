package com.Q5;

import java.io.Serializable;

public class Student implements Serializable {

	private int roll;
	private String name;
	private int marks;
	private String email;
	private String password;
	Address address;
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public Address getAddress() {
		return address;
	}
	
	
	public Student(int roll, String name, int marks, String email, String password, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", email=" + email + ", password="
				+ password + ", address=" + address + "]";
	}

	
	
	
}
