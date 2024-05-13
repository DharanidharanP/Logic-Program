package Common_interview_questions;

public class PrimeNumber {

	public static void main(String[] args) {
		int no=10;
		int div=2;
	    boolean prime=true;
	    for(div=2;div<no;div++) {
	    	if(no%div==0) {
	    		prime=false;
	    		break;
	    	}
	    	
	    }
	      System.out.println(prime);
	}
}
