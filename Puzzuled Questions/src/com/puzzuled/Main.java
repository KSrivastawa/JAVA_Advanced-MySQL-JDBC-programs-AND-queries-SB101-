package com.puzzuled;

public class Main {

	public static void main(String[] args) {

		int  x = 789;
		int y = 0;
		int z;
		
		
		while(x!=0) {
			
			z = x/10;
			
			y = y*10+z;
			
			x/=10;
		}
		System.out.println("Y: "+y);
	}

}
