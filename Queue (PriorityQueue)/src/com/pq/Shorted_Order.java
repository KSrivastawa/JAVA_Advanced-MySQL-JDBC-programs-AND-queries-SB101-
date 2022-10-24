package com.pq;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


// default FIFO order (and Also possible to change order as per our requirements)

public class Shorted_Order {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(15);
		pq.add(25);
		
		System.out.println(pq);   // [10, 15, 25, 40, 20, 30]
		
		
		// in shorted order
		Integer in;
		
		while((in= pq.poll())!=null) {
			System.out.print(in+" ");  // 10 15 20 25 30 40
			
		}

		
	}

}
