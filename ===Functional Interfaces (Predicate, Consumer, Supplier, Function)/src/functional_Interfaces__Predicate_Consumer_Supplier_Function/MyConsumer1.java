package functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.function.Consumer;

public class MyConsumer1 {

	public static void main(String[] args) {
		
		Consumer<String> consumer = s-> System.out.println(s);
		
		consumer.accept("Hello Ketan This is Consumer by Labmda");
		
		
	}
	
	
}
