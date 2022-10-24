package com.Q5_SortBy_Price_Descending_lambda;

import java.util.*;

public class DemoList {
	

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(11,"Rice", 2, 60));
		list.add(new Product(22,"Apple", 2, 95));
		list.add(new Product(33,"Wheat", 2, 70));
		list.add(new Product(44,"Garlic", 2, 63));
		list.add(new Product(55,"Ginger", 2, 82));
		list.add(new Product(66,"Potao", 2, 33));
		
		
		Collections.sort(list, (o1, o2)-> (o1.getPrice() > o2.getPrice()) ? -1 : (o1.getPrice() < o2.getPrice()) ? +1 : 0);
		
		// System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
	}

}
