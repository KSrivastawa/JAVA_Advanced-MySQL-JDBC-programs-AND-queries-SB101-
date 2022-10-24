package functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.function.Function;

public class MyFunctionCheckException {

	public static void main(String[] args) {
		
		Function<Integer, Double> function = t -> t/3.5;
		
		try {
			function = function.andThen(null);
			
			System.out.println(function.apply(25));
			
		} catch (Exception e) {
			System.out.println("Exception thrown while passing Null: " +e);
		}

	}

}
