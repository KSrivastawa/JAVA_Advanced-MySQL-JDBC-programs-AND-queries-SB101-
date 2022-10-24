package using_Static_Method;

import java.util.ArrayList;
import java.util.List;

// double colon (::) operator
/*
 * syntax:  (ClassName::methodName)
 * example: UsingStatic::printMethodValues
 */

public class UsingStatic {

	public static void printMethodValues(String s) {
		
		System.out.print(s+" ");
		
	}
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Ketan");
		list.add("You");
		list.add("are");
		list.add("so");
		list.add("Handsome!");
		
		list.forEach(UsingStatic :: printMethodValues );
		

	}

}
