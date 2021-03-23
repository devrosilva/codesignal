package sortbyheight;
/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange 
the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */

//Method modified to public static to facilitate test. To test it, you will need to pass a int[] as argument. Then, I suggest 
//that you assign the return of the method to the same array and iterate it to see the result.
public class SortByHeight {
	public static int[] sortByHeight(int[] a) {
	    int aux = 0;
	 
	    for(int i = 0; i < a.length; i++){
	        if(a[i] != -1){
	            for(int j = i; j < a.length; j++){
	                if( (a[j] != -1) && (a[j] < a[i]) ){
	                    aux = a[j];
	                    a[j] = a[i];
	                    a[i] = aux; 
	                }
	            }
	        }
	    }
	    return a;
	}
}
