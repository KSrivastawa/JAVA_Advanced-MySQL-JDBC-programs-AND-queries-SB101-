package using_Instance_Method;

// Syntax: (objectOfClass::methodName)
// Example: (new Using_Instance() :: printInstanceMethod);

import java.util.Arrays;
import java.util.List;

public class Using_Instance {

	void printInstanceMethod(Integer i) {
		
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,5,8,9,3,5,8,9);
		
		// Using_Instance instance = new Using_Instance();
		
		// integers.forEach(instance :: printInstanceMethod);
		
		integers.forEach(new Using_Instance() :: printInstanceMethod);

	}

}
