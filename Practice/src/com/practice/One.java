package com.practice;

public class One{
	
	int a;
	int b;
	int c;
	
	One(int c){
		
		this.c = c;
		
	}
	
	One(int a, int b){
		
		this.a = a;
		this.b = b;
		
	}
	
	public int A() {
		
		int sum = a+b;
		
		return sum-c;
		
	}
	
	
	
	public static void main(String[] args) {
		
		One one = new One(14);
		One one2 = new One(14, 45);
		
		System.out.println(one2.A());
		
	}
	
}



