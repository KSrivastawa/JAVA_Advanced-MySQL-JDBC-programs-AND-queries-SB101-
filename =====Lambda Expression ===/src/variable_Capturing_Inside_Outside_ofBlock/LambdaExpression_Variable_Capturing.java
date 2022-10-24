package variable_Capturing_Inside_Outside_ofBlock;

public class LambdaExpression_Variable_Capturing {
	
	int num = 150;

	public static void main(String[] args) {
		
		LambdaExpression_Variable_Capturing lvc = new LambdaExpression_Variable_Capturing();
		
		Variable_Capturing  variable_Capturing = () -> {

			System.out.println("Initial Value: " + lvc.num);
			
			 lvc.num += 500;
			
			System.out.println("After Value Added inside block: " + lvc.num);
			
		};
		
		variable_Capturing.myFunction();
		
		lvc.num += 260;
		
		System.out.println("After Value Added outside block: " + lvc.num);

	}

}
