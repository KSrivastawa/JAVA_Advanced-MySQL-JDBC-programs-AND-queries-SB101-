package intermediate.Operatios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream");
		
		List<String> strings = list.stream().filter(s-> s.startsWith("S")).collect(Collectors.toList());
		List<String> strings2 = list.stream().filter(s-> s.contains("ection")).collect(Collectors.toList());

		
		System.out.println(strings);
		System.out.println(strings2);

		
	}

}
