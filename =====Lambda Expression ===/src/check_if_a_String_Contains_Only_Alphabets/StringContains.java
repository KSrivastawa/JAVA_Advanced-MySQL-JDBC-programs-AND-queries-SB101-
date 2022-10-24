package check_if_a_String_Contains_Only_Alphabets;

public interface StringContains {

	static boolean stringContainsOnlyAlphbetics(String s) {
		
		return (!s.equals("") && s!= null && (s.chars().allMatch(Character::isLetter)));
				
	}
	
}
