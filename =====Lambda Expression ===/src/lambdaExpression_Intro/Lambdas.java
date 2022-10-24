package lambdaExpression_Intro;

public class Lambdas {

	public static void printLambda(Employee employee) {
		
		employee.printName("Ketan", 99);
		
	}
	
	public static void main(String[] args) {
		
		Employee employee = (String name, int roll) -> System.out.print("Name: "+name+", Roll: "+roll);
		
		printLambda(employee);
		
	}

}
