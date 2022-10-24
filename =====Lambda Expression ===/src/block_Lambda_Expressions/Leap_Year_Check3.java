package block_Lambda_Expressions;

/*
 * Here in this block lambda has if-else conditions and return statements which are legal in lambda body.
 */

public class Leap_Year_Check3 {

	public static void main(String[] args) {
		
		Fun3 fun3 = a ->{
			
			if((a%400 == 0) || (a%4==0 && a%100 !=0) )
				return true;
			
			return false;
			
		};
		
		int year = 2000;
		
		if(fun3.leapYearCheck(year))
			System.out.println(year +" is a Leap Year!");
		
		else
			System.out.println(year +" is Not a Leap Year!");
		

	}

}
