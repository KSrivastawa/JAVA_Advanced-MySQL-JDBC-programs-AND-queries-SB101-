package com.Q4_Serialization_Deserialization_List_of_5_Students;

import java.io.Serializable;

public class Address implements Serializable {

	String state;
	String city;
	long pincode;
	
	public Address(String state, String city, long pincode) {
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
