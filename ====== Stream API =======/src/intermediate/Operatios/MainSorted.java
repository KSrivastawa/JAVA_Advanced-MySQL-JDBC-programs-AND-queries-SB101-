package intermediate.Operatios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainSorted {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream");

		// Sorted in ascending order
		List<String> strings = list.stream().sorted().collect(Collectors.toList());
		
		// Sorted in descending order
		List<String> strings2 = list.stream().sorted((o1,o2)-> o2.compareTo(o1)).collect(Collectors.toList());
		
		
		System.out.println(strings);
		System.out.println(strings2);
		
	}

}
