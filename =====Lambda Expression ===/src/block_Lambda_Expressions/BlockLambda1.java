package block_Lambda_Expressions;

public class BlockLambda1 {

	public static void main(String[] args) {
		
		Fun1 fun1 = (a)-> a%2==0 ? true: false;
		
		int num = 25;
		
		if(fun1.find(num))
		System.out.println(num + " is Even!");
		
		System.out.println(num +" is Odd!");

	}

}
