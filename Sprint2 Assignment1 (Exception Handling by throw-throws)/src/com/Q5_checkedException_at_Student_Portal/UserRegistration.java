package com.Q5_checkedException_at_Student_Portal;

public class UserRegistration {

	void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			
			System.out.println("User registration done successfully");
		}
		else {
			
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
		
	}
	
}
