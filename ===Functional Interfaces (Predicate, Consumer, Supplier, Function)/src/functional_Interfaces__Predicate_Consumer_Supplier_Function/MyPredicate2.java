package functional_Interfaces__Predicate_Consumer_Supplier_Function;

import java.util.*;
import java.util.function.Predicate;
  
// Predicate method always be return type is boolean

public class MyPredicate2 {
	
    public static void main(String args[]) {
  
        List<String> names = Arrays.asList(
            "Geek", "GeeksQuiz", "g1", "QA", "Geek2", "Q3", "Quiz");
  
        // find the string start with letter--
        
        Predicate<String> p = (s) -> s.startsWith("G");  // condition applied by Lambda
  
        for (String st : names) {

            if (p.test(st))    // catch in the boolean 
                System.out.println(st);  // printing the elements which are true
        }
         
        
    }
}
