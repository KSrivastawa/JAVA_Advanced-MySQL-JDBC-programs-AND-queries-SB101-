package com.Q5_SortBy_Price_Descending_lambda;


import java.util.*;

public class DemoTreeSet {

	
	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<Product>((o1, o2)-> (o1.getPrice() > o2.getPrice()) ? -1 : (o1.getPrice() < o2.getPrice()) ? +1 : 0);
		
		set.add(new Product(11,"Rice", 2, 60));
		set.add(new Product(22,"Apple", 2, 95));
		set.add(new Product(33,"Wheat", 2, 70));
		set.add(new Product(44,"Garlic", 2, 63));
		set.add(new Product(55,"Ginger", 2, 82));
		set.add(new Product(66,"Potao", 2, 33));
				
		// System.out.println(set);
		
		List<Product> list = new ArrayList<>(set);
		
			for(int i=0; i<list.size();i++) {
			
				System.out.println(list.get(i));
			}
		
	}
	
}
