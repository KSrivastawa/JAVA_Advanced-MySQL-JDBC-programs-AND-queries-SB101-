package double_Colon_Operator_Intro;

import java.util.stream.Stream;

public class Doble_Colon1 {

	public static void main(String[] args) {
		
		// stream.forEach( System.out::println);  - double colon syntax
		
		Stream<String> stream = Stream.of("Ketan", "How", "are", "you", "!");
		
		stream.forEach(System.out::println);
		
		
	}

}
