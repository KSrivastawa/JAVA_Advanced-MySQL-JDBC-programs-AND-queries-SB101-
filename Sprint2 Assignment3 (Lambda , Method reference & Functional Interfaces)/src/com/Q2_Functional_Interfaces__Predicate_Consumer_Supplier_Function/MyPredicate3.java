package com.Q2_Functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class MyPredicate3  {

	public static void main(String[] args) {
		
		// student marks greater than 500
		
		List<Studentss> hm = new ArrayList<>();
		
		hm.add( new Studentss(11, "Ketan1", 450));
		hm.add( new Studentss(12, "Ketan2", 789));
		hm.add( new Studentss(13, "Ketan4", 344));
		hm.add( new Studentss(14, "Ketan3", 889));
		
		
		//System.out.println(hm);
		
		
		Predicate<Studentss> predicate = t -> t.getMarks()> 500;
		System.out.println(predicate.test(hm.get(0)));  // false
		
		for(Studentss s : hm ) {
			System.out.println(s);
		}
		
		System.out.println(); // for gap
		// removed object will print 
		hm.removeIf(predicate);  
		for(Studentss s : hm ) {
			System.out.println(s);
		}
		
	}

}
