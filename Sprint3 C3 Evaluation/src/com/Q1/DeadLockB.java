package com.Q1;

public class DeadLockB {

	public synchronized void fB(DeadLockA a) {
		
		System.out.println("fB of DeadLockB starts");
		
		a.f1();
		
		System.out.println("fB of DeadLockB ends");
		
	}
	
	// To avoid deadlock- removed this method.
	
	// public synchronized void f2() {
		
	//	System.out.println("inside f2 DeadLockB");
	// }
	
	/*
	 * Note:-
	 * Here if any method of class DeadLockA  or class DeadLockB we remove the synchronized keyword
	 * then it will not become deadlock.
	 */
	
	 public void f2() {
		
		System.out.println("inside f2 DeadLockB");
	 }
	
}
