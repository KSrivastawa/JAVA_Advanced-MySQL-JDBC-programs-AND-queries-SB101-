package functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.function.Supplier;

public class MySupplier implements Supplier<Integer> {

	@Override
	public Integer get() {
		int x = 10;
		
		return x*35;
	}
	
	
	public static void main(String[] args) {
		
		Supplier<Integer> supplier = new MySupplier();
		
		System.out.println(supplier.get());
		
	}

}
