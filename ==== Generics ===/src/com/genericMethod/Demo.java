package com.genericMethod;

public class Demo {

	public static <T> void fun1(T[] t) {
		
		System.out.println("fun1 T");
		
		for(T t1: t) {
			System.out.println(t1);
		}
		
		
		
	}
	
	public static void main(String[] args) {

	//	int[] arr = {4,5,6,6,8,47,1};  // invalid - because it is dataTypes 
		
		Integer[] arr = {4,5,6,6,8,47,1};
		String[] str = {"Ketan", "Prashant", "Riku"};
		
		fun1(arr);
		fun1(str);
				

	}

}


