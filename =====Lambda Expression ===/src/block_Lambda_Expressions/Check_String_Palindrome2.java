package block_Lambda_Expressions;

public class Check_String_Palindrome2 {

	public static void main(String[] args) {
		
		Fun2 fun2 = (s)-> {
			
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			String rev = sb.toString();
			
			if(rev.equals(s))
				return true;
			
			return false;
		};
		
		String str = "marm";
		
		boolean x = fun2.findPalindrome(str);
		
		if(x)
			System.out.println("Palindrome!");
		
		else
		System.out.println("Not Palindrome!");

	}

}
