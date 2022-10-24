package intermediate.Operatios;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class MainMap {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,8,9,6,5,5);
		
		List<Integer> integers2 = integers.stream().map(x-> x*3).collect(Collectors.toList());
		
		System.out.println(integers2);
		

	}

}
