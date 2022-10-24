package com.Q1;

public class Main {

	public static void main(String[] args) {
		
		DeadLockA a = new DeadLockA();
		DeadLockB b = new  DeadLockB();
		
		ThreadA a2 = new ThreadA(a, b);
		
		ThreadB b2 = new ThreadB(a, b);
		
		a2.start();
		b2.start();

	}

}
