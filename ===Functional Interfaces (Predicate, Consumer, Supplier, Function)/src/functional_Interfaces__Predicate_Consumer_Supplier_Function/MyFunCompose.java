package functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.function.Function;

/*
 Method 3: compose()
 Syntax: default <V> Function<V, R> 
		compose(Function<? super V, ? extends T> before)
 */

public class MyFunCompose {

	public static void main(String[] args) {
		
		Function<Integer, Double> function = t -> t/2.3 ;  

		function = function.compose(a-> a+2);
		
		System.out.println(function.apply(78));
		
	}

}
