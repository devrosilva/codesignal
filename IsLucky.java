package islucky;

/*
 * Exercise description:
 * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

    For n = 1230, the output should be
    isLucky(n) = true;
    For n = 239017, the output should be
    isLucky(n) = false.

 */

//Method modified to static to facilitate use. To test it, call the method at main passing a int number as argument.
public class IsLucky {
	public static boolean isLucky(int n) {
	    Integer integerN = n;
	    
	    String integerToString = integerN.toString();
	    
	    //Variables to stores the first and second half of the numbers.
	    int firstHalf = 0;
	    int secondHalf = 0;
	    
	    //Stores the numbers
	    for(int i = 0; i < integerToString.length(); i++){
	        if( i < (integerToString.length() / 2) ){
	            firstHalf += integerToString.charAt(i);
	        }
	        else{
	            secondHalf += integerToString.charAt(i);
	        }
	    }
	    
	    if(firstHalf == secondHalf){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
