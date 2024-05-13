package Common_interview_questions;

public class Reverse_num_And_Palindrome {

	 public static void main(String[] args) {
	       int no=121;
	       int temp=no;
	       int reversedNo = 0;
	     while(no>0) {
	    	 int rem=no%10;
	    	 reversedNo = reversedNo*10+rem;
	    	 no=no/10;
	     }
	    	if(temp==reversedNo) {
	    		System.out.println("palindrome");
	    	}
	    	else{
	    		System.out.println("not palindrome");
	    	}
	    }
}
