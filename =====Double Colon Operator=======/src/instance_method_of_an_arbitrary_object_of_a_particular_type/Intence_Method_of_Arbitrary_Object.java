package instance_method_of_an_arbitrary_object_of_a_particular_type;

import java.util.ArrayList;
import java.util.List;

// Syntax: (ClassName::methodName)
// Example: ArbitraryObject::someInstanceMethod

public class Intence_Method_of_Arbitrary_Object {

	public static void main(String[] args) {
		
		List<ArbitraryObject> list = new ArrayList<>();
		
		list.add(new ArbitraryObject("Ketan"));
		list.add(new ArbitraryObject("How"));
		list.add(new ArbitraryObject("are"));
		list.add(new ArbitraryObject("you!"));
		
		list.forEach(ArbitraryObject :: someInstanceMethod);
		

	}

}
