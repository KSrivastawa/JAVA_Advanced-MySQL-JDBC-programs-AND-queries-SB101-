package com.practice;


class Poly{
	
	int a;
	int b;
	int c;
	
	Poly(int c){
		this.c = c;
		
	}
	
	Poly(int a, int b){
		this.a = a;
		this.b = b;
		
	}
	
	public int sum() {
		
		int s = a+b;
		
		return s-c;
		
	}
	
	public static void main(String[] args) {
		
		Poly poly = new Poly(5);
		Poly poly2 = new Poly(5,9);
		
		System.out.println(poly2.sum()+poly.sum());
		
		
	}
	
	
}




