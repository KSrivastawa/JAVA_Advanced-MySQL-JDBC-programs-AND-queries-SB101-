package com.Q5_SortBy_Price_Descending_lambda;

import java.util.*;

public class DemoTreeMap {


	public static void main(String[] args) {
		
		Map<Integer, Product> map = new TreeMap<>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		
		
		map.put(1, new Product(11,"Rice", 2, 60));
		map.put(2, new Product(22,"Apple", 2, 95));
		map.put(3, new Product(33,"Wheat", 2, 70));
		map.put(4, new Product(44,"Garlic", 2, 63));
		map.put(5, new Product(55,"Ginger", 2, 82));
		map.put(6, new Product(66,"Potao", 2, 33));
				
		System.out.println(map);
		
		
		
		
	}
	
}
