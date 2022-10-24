package com.Q1;

public class ThreadB extends Thread {

	DeadLockA a;
	DeadLockB b;
	
	public ThreadB(DeadLockA a, DeadLockB b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		b.fB(a);
	}
	
}
