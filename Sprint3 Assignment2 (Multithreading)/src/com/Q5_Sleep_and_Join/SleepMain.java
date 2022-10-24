package com.Q5_Sleep_and_Join;

public class SleepMain {

	
	public static void main(String[] args) {
		
		Sleep sleep1 = new Sleep();
		Sleep sleep2 = new Sleep();
		Sleep sleep3 = new Sleep();
		
		sleep1.start();
		sleep2.start();
		sleep3.start();
		
		sleep1.setName("Ketan's");
		sleep2.setName("Prashant's");
		sleep3.setName("Riku's");
		
		String s = Thread.currentThread().getName();
		for(int i=0; i<3; i++) {
			
			System.out.println(s);
		}
		
		
	}

}
