package Common_interview_questions;

import java.util.Arrays;

public class First_two_AND_Last_two_Swap {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};
	        int rotations = 2; 
	        
	        for (int i = 0; i < rotations; i++) {
	            int lastElement = arr[arr.length - 1];
	            for (int j = arr.length - 1; j > 0; j--) {
	                arr[j] = arr[j - 1];
	            }
	            arr[0] = lastElement;
	        }
	        
	        for(int i=0;i<arr.length;i++) {
	       // for (int num : arr) {
	            System.out.print(arr[i] + " ");
	        }
	}
		
	}


