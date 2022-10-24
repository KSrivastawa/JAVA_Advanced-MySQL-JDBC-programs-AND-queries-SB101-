package functional_Interfaces__Predicate_Consumer_Supplier_Function;

/*
 Method 1: apply()
 Syntax: R apply(T t)
 
 Method 2: andThen()
 Syntax: default <V> Function<T, V> 
		andThen(Function<? super R, ? extends V> after)
 */

import java.util.function.Function;

public class MyFunction3 {

	public static void main(String[] args) {
		
		Function<Integer, Double> function = t -> t/2.0;
		
		System.out.println(function.apply(15));  // 7.5
		
		
		function = function.andThen(a -> a*3);
		
		System.out.println(function.apply(23));  // 34.5  [first 23/2.0 = 11.5, then 11.5*3 = 34.5]

	}

}
