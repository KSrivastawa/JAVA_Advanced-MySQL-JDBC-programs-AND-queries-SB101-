package terminal.Operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainCollect {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(4,98,6,4,52);
		
		Set<Integer> set = integers.stream().map(s-> s*s).collect(Collectors.toSet());
		
		System.out.println(set);
		
		
	}
	
}
