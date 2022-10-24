package functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicate implements Predicate<List<String>> {

	@Override
	public boolean test(List<String> t) {
		
		if(t.contains("Ketan")) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("K");
		list.add("n");
		list.add("Ketan");
		list.add("e");
		list.add("ta");
		
		Predicate<List<String>> predicate = new MyPredicate();
		
		System.out.println(predicate.test(list));
		
		
	}
	
}
