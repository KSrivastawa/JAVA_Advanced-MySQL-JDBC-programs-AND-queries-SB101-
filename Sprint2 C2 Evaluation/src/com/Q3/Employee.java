package com.Q3;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	private String address;
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	
	
	public Employee(int empId, String name, double salary, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	

	
}
