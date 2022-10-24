package terminal.Operations;

import java.util.Arrays;
import java.util.List;

public class Main_Reduce {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(4,7,6,9,4,2);
		
		int even = integers.stream().filter(x-> x%2==0).reduce(0, (ans, i)-> ans+i);
		
		System.out.println(even);
		
	}

}
