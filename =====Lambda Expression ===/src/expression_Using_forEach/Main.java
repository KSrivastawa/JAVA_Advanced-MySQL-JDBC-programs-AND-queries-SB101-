package expression_Using_forEach;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		
		Stream<String> stream = Stream.of("Hello","!"," Ketan");
		
		stream.forEach(s-> System.out.print(s));
		

	}

}
