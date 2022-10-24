package com.Q5;

import java.io.Serializable;

public class Address implements Serializable {

	private String state;
	private String city;
	private String pincode;
	
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getPincode() {
		return pincode;
	}
	
	
	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

	
}
