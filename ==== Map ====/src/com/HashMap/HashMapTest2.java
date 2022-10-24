package com.HashMap;

// Different ways to insert elements:

import java.util.*;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		
		System.out.println("Intial List of Element:" + hm);  // {}
		
		hm.put(4, "T");
		hm.put(6, "N");
		hm.put(1, "K");
		hm.put(5, "A");
		hm.put(3, "E");
		
		System.out.println(hm);  // {1=K, 3=E, 4=T, 5=A, 6=N}
		
		for(Map.Entry<Integer,String> me: hm.entrySet()) {
			
			System.out.println("Key: "+ me.getKey() +" "+ "Value: "+ me.getValue());
		}
		
		/* output: (in shorted order)
		 	Key: 1 Value: K
			Key: 3 Value: E
			Key: 4 Value: T
			Key: 5 Value: A
			Key: 6 Value: N
		 */
		System.out.println("===================================");
		
		hm.putIfAbsent(2, "P");  // inserting elements if not available
		for(Map.Entry<Integer,String> me: hm.entrySet()) {
			
			System.out.println("Key: "+ me.getKey() +" "+ "Value: "+ me.getValue());
		}
		
		/* output: (in shorted order)
		 	Key: 1 Value: K
		 	Key: 2 Value: P
			Key: 3 Value: E
			Key: 4 Value: T
			Key: 5 Value: A
			Key: 6 Value: N
	 */
		
		
		Map<Integer, String> hm2 = new HashMap<>();
		
		System.out.println("Intial List of Element:" + hm2);  // {}
		
		hm2.put(7, "S");
		
		hm2.putAll(hm);
		
		 System.out.println("After invoking the putAll() method:: "); 
		 
		 for(Map.Entry<Integer, String> me: hm2.entrySet()) {
			 
			 System.out.println("Key: "+me.getKey()+" "+ "Value: "+ me.getValue());
			 
		 }
		/* in shorted order
		  	Key: 1 Value: K
			Key: 2 Value: P
			Key: 3 Value: E
			Key: 4 Value: T
			Key: 5 Value: A
			Key: 6 Value: N
			Key: 7 Value: S
		 */
		
		
	}
	
}




