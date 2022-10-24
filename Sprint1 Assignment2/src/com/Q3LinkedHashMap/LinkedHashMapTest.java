package com.Q3LinkedHashMap;

import java.util.*;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		Map<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("Bihar", "Patna");
		lhm.put("U.P.", "Lucknow");
		lhm.put("Jharkhand", "Ranchi");
		lhm.put("M.P.", "Bhopal");
		lhm.put("Rajasthan", "Jaipur");
		
		Set set = lhm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> me = (Map.Entry<String, String>)itr.next();
		
			System.out.println("State: "+me.getKey()+", "+"Capital: "+me.getValue());
			
		}
		
		
	}

}
