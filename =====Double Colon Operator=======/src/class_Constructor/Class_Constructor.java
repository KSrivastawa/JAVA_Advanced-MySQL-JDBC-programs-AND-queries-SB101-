package class_Constructor;

import java.util.Arrays;
import java.util.List;

// Syntax: (ClassName::new)
// Example: Class_Constructor::new

public class Class_Constructor {

	String str;

	public Class_Constructor(String s) {
		
		this.str = s;
		System.out.println("Hello! "+this.str);
	}

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ketan","Prashant","Riku");
		
		list.forEach(Class_Constructor :: new);
		

	}

}
