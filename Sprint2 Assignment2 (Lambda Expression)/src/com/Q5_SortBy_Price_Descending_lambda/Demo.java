package com.Q5_SortBy_Price_Descending_lambda;

public class Demo {

	public static void main(String[] args) {
		
		
		Intr intr = (a, b, c, d) -> new Product(d, b, a, c);
			 
	System.out.println(intr.createProductDetails(4, "Rice", 45, 88));

		
	}

}
