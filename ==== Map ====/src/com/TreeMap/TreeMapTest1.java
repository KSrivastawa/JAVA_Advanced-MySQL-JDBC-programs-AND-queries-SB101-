package com.TreeMap;

import java.util.*;

public class TreeMapTest1 {

	public static void main(String[] args) {

		Map<Integer, String> tm = new TreeMap<Integer, String>();
		
		System.out.println(tm);  // {}
		
		tm.put(9, "Ketan");
		tm.put(6, "Prashant");
		tm.put(7, "Riku");
		tm.put(3, "Big Hitter");
		tm.put(4, "Anna");
		tm.put(1, "Babu");
		
		System.out.println(tm);  //  {1=Babu, 3=Big Hitter, 4=Anna, 6=Prashant, 7=Riku, 9=Ketan}
		
		// Using iterator
		
		Set set = tm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>)itr.next();
			
			System.out.println("Key: "+me.getKey()+" "+"Value: "+me.getValue());
			
		}
		
		/* output: in Shorted order
		 	Key: 1 Value: Babu
			Key: 3 Value: Big Hitter
			Key: 4 Value: Anna
			Key: 6 Value: Prashant
			Key: 7 Value: Riku
			Key: 9 Value: Ketan
		 */
		
		
		
		

	}

}
