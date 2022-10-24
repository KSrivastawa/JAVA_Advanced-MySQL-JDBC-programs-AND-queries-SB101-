package com.Q1_CheckedException_from_Constructor;

public class Tiger extends Animal{

	public Tiger() throws AnimalException {
		super();
		
	}

	@Override
	void eat() throws AnimalException {
		System.out.println("Tiger is eating!!");
		
	}

	
	public static void main(String[] args) {
		
		try {
			Animal animal = new Tiger();
			
			animal.eat();
			
		} catch (AnimalException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
