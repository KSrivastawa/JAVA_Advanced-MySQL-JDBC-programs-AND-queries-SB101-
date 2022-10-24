package com.Q1;

public class ThreadA extends Thread {

	DeadLockA a;
	DeadLockB b;
	
	public ThreadA(DeadLockA a, DeadLockB b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		a.fA(b);
	}
	
}
