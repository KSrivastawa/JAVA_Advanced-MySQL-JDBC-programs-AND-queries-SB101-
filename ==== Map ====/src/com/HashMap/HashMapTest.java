package com.HashMap;

import java.util.*;


public class HashMapTest {

	public static void main(String[] args) {

		Map hashMap = new HashMap(); 
		
		hashMap.put(4, "Roxy");
		hashMap.put(2, "Sunil");
		hashMap.put(5, "Sandy");
		hashMap.put(1, "Munish");
		hashMap.put(3, "Pardeep");
		
		System.out.println("HashMap Elements:");
		System.out.println(hashMap);
	
		Set set = hashMap.entrySet();
		
		Iterator itr = set.iterator();
		
		System.out.println("HashMap elements using iterator:");
		while(itr.hasNext()) {
			
			Map.Entry mapEntry = (Map.Entry)itr.next();
			
			System.out.println("Key: "+ mapEntry.getKey()+","+"Value: "+ mapEntry.getValue());
		}
		

	}

}

/*
 * OutPut: 

 HashMap Elements:
{1=Munish, 2=Sunil, 3=Pardeep, 4=Roxy, 5=Sandy}
HashMap elements using iterator:
Key: 1,Value: Munish
Key: 2,Value: Sunil
Key: 3,Value: Pardeep
Key: 4,Value: Roxy
Key: 5,Value: Sandy

 */


