package New_programs;

public class Magic_number {

	
		
		 public static void main(String[] args) { 
		       int num = 127;  
		       int sumOfDigits = 0;
		      
		       while(num>0 || sumOfDigits>9) {
		    	   if(num==0) {
		    		   num=sumOfDigits;
		    		   sumOfDigits=0;
		    	   }
		    	   sumOfDigits =sumOfDigits+num%10;
		    	   num=num/10;
		       }
		       if(sumOfDigits==1) {
		    	   System.out.println("magic");
		       }
		       else
		    	   System.out.println("not magic");
		
	}
		 }

