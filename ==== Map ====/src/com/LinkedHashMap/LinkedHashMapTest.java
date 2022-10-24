package com.LinkedHashMap;

import java.util.*;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> lhm = new LinkedHashMap<>();
		
		System.out.println(lhm); // {}
		
		lhm.put(5, "Ketan1");
		lhm.put(1, "Ketan2");
		lhm.put(4, "Ketan3");
		lhm.put(3, "Ketan4");
		lhm.put(8, "Ketan5");
		
		System.out.println(lhm);  // {5=Ketan1, 1=Ketan2, 4=Ketan3, 3=Ketan4, 8=Ketan5}
		
		// Using iterator;
		
		Set set = lhm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry)itr.next();
			
			System.out.println("Key: "+ me.getKey()+" "+"Value: "+me.getValue());
			
		}
		
		/* output: unShorted order, it will print as in order to put.
		  	Key: 5 Value: Ketan1
			Key: 1 Value: Ketan2
			Key: 4 Value: Ketan3
			Key: 3 Value: Ketan4
			Key: 8 Value: Ketan5

		 */
		
		

	}

}
