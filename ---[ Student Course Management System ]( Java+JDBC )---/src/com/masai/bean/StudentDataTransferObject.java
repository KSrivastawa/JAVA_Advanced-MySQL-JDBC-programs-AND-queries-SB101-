package com.masai.bean;

public class StudentDataTransferObject {

	private int roll;
	private String name;
	private String email;
	private String cname;
	private int fee;
	
	public StudentDataTransferObject() {
		// TODO Auto-generated constructor stub
	}

	public StudentDataTransferObject(int roll, String name, String email, String cname, int fee) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.cname = cname;
		this.fee = fee;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
	
}
