package week1.assignment2;

import java.util.Arrays;  

public class MissingElementInAnArray {
	
	//How to find the consecutive missing num? 
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		 
		int i=1;

	        while ( i < arr.length ) 
	        {
	            if ( arr[i] - arr[i-1] == 1 ) 
	            {
	            } 
	            else 
	            {
	                System.out.println( "Missing number is " + ( arr[i-1] + 1 ) );
	            }
	            i++;
	        }
	}
	
}
