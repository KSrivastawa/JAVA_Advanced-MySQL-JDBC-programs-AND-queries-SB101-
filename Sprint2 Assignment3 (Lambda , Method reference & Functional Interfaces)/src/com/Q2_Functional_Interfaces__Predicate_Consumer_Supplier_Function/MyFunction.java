package com.Q2_Functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// method: apply()
// Syntax: R apply(T t)
// R is returning and T is getting 

class MyFunction implements Function<Studentss, String> {

	private String s;

	@Override
	public String apply(Studentss t) {
		
		if(t.getMarks()>750)		
		return "Congrats! You got 1st division Marks";
		
		return "Sorry you got low marks!";
	}

	public String getS() {
		return s;
	}

	
	public static void main(String[] args) {
		
		List<Studentss> hm = new ArrayList<>();
		
		hm.add( new Studentss(11, "Ketan1", 450));
		hm.add( new Studentss(12, "Ketan2", 789));
		hm.add( new Studentss(13, "Ketan4", 344));
		hm.add( new Studentss(14, "Ketan3", 889));
		
		Function<Studentss, String> function = new MyFunction();
		
		for(Studentss s : hm) {
			System.out.println(function.apply(s));
		}
			
		
		
	}
	
	
}








