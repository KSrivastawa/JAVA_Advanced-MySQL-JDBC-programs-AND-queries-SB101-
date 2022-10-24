package com.Q1;

public class DeadLockA {

	public synchronized void fA(DeadLockB b) {
		
		System.out.println("fA of DeadLockA starts");
		
		b.f2();
		
		System.out.println("fA of DeadLockA ends");
		
	}
	
	public synchronized void f1() {
		
		System.out.println("inside f1 DeadLockA");
	}
	
	
	
}
