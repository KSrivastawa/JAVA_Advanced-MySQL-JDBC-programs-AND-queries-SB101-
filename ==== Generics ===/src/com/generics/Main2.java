package com.generics;

/*
 	Demo<Number> d = new Demo<>();
 	Demo<Integer> d = new Demo<>();
 	Demo<Double> d = new Demo<>();
 	
 */


public class Main2 {

	public static void main(String[] args) {

		MyGen2<Number> num = new MyGen2<>(12);
		System.out.println(num.getData());
		System.out.println(); // for line gap
		
		MyGen2<Integer> integer = new MyGen2<>(78);
		System.out.println(integer.getData());
		System.out.println(); // for line gap
		
		MyGen2<Double> doub = new MyGen2<>(78.96);
		System.out.println(doub.getData());
		System.out.println(); // for line gap
		

	}

}

class MyGen2<T extends Number> {
	
	Number data;
	
	public MyGen2(Number data) {

		this.data = data;
	}
	
	public Number getData() {
		return  data;
			
	}
	

}







