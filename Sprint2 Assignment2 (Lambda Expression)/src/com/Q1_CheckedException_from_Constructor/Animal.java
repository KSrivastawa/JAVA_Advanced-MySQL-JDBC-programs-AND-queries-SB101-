package com.Q1_CheckedException_from_Constructor;

public abstract class Animal {

	abstract void eat() throws AnimalException;
	
	public Animal() throws AnimalException {
		//System.out.println("from Animal");
	}
	
}
