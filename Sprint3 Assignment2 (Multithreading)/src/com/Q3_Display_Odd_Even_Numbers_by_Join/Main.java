package com.Q3_Display_Odd_Even_Numbers_by_Join;

public class Main {

	public static void main(String[] args) {

		EvenNumbers evenNumbers = new EvenNumbers();
		
		OddNumbers numbers = new OddNumbers(evenNumbers);
		
		evenNumbers.start();
		numbers.start();
		

	}

}
