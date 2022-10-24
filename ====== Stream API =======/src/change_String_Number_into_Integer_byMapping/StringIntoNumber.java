package change_String_Number_into_Integer_byMapping;

import java.util.Arrays;
import java.util.List;

public class StringIntoNumber {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("7", "63", "45", "9", "33");
		
		List<String> list2 = Arrays.asList("17", "13", "65", "29", "31");
		
		list.forEach( s -> System.out.print(s+" ")); // Lambda Expression
		System.out.println();
		list.forEach(System.out::println);  // Double colon/method reference
		
		System.out.println("-----------");
		
		// change string number into Integer number
		list.forEach(s -> System.out.println(Integer.parseInt(s)*3));  // changed into number and multiply
		System.out.println("-----------");
	
		list.stream().map(s -> Integer.parseInt(s)*2)
		.filter( f -> f<50)
		.forEach( s -> System.out.println(s)); //  changed into number then multiply and then filter by 50 then print
		
		System.out.println("-----------");
		list2.stream().map(Integer::parseInt)
		.map(s -> s*2).filter(f -> f > 50)
		.forEach(System.out::println); //  changed into number then multiply and then filter by 50 then print

	
	}

}
