package multiple_Interface_using_ReturnMethod;

public class Main {

	
	private int useNumericals(int a, int b, Interface1 num) {
		
		return num.addMulti(a, b);
	}
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		Interface1 interface1 = (a, b) -> a+b;
		
		Interface1 interface2 = (a, b) -> a*b;
		
		System.out.println("Added Value: "+
				main.useNumericals(2, 3, interface1)
		+ ", Multiplied Value: "+ main.useNumericals(3, 4, interface2)
		);

		Interface2 interface22 = (String author) -> System.out.println(author);
		interface22.author("Ketan");

		
	}

}
