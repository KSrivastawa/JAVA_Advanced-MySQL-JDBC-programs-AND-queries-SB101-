package functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// method: apply()
// Syntax: R apply(T t)
// R is returning and T is getting 

public class MyFunction implements Function<Student, String> {

	private String s;

	@Override
	public String apply(Student t) {
		
		if(t.getMarks()>750)		
		return "Congrats! You got 1st division Marks";
		
		return "Sorry you got low marks!";
	}

	public String getS() {
		return s;
	}

	
	public static void main(String[] args) {
		
		List<Student> hm = new ArrayList<>();
		
		hm.add( new Student(11, "Ketan1", 450));
		hm.add( new Student(12, "Ketan2", 789));
		hm.add( new Student(13, "Ketan4", 344));
		hm.add( new Student(14, "Ketan3", 889));
		
		Function<Student, String> function = new MyFunction();
		
		for(Student s : hm) {
			System.out.println(function.apply(s));
		}
			
		
		
	}
	
	
}








