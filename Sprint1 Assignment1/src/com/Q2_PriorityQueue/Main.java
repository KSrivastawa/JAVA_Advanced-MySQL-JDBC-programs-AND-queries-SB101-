package com.Q2_PriorityQueue;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of products needs to Add:");
		
		int numOfProducts = sc.nextInt();
		
		int productId; double productPrice; String productName;
		
		Queue<Product> productPriority = new PriorityQueue<>(new CompareByPrice()); 
		
		Product pro;
		
		int c =-0;
		for(int i=0; i<numOfProducts; i++) {
			
			System.out.println("Enter the details of products "+ ++c +":");
			
			System.out.println("Enter Product Id:");
			productId = sc.nextInt();
			
			System.out.println("Enter Product Name:");
			productName = sc.next();
			
			System.out.println("Enter product Price:");
			productPrice = sc.nextDouble();
			
			
			pro = new Product(productId, productName, productPrice);
			
			productPriority.add(pro);
			
		}
		
		List<Product> list = new ArrayList<>();
		Product i;
		
		while((i= productPriority.poll())!= null) {
			list.add(i);
		}
		
		
		Iterator<Product> itr = list.iterator();
		
		int count=0;
		while(itr.hasNext()) {
			
			System.out.println("\nDisplyed Product "+ ++count +":");
			
			Product p = itr.next();
			
			System.out.println("- Product Id: "+ p.getProductId());
			System.out.println("- Product Name: "+ p.getProductName());
			System.out.println("- Product Price: "+ p.getProductPrice());
			
			System.out.println("---------------------------");
			
		}
		

	}

}
