package super_Method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


// Syntax: (super::methodName)
// Example: (new Super()::someSuperClassMethod)

public class Super_Method  extends Super {

	@Override
	String someSuperClassMethod(String s) {
		
		Function<String, String> func = super :: someSuperClassMethod; 
		
		String str = func.apply(s);   // here must apply the string by function
		
		str += "Bye! " + s + "\n";
		
		System.out.println(str);

		return str;
		
	}
	
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Ketan", "Prashant", "Riku");
		
		list.forEach(new Super_Method() :: someSuperClassMethod );

	}

}
