package Interview_questions;

public class SecondMin {

	public static void main(String[] args) {
		  int [] num= {2,3,1,-1,1,6,5,4};
	      int min=num[0];
	      int secondMin=num[0];
	      for(int i=0;i<num.length;i++) {
	    	  for(int j=0;j<num.length;j++) {
	    		  if(num[i]<num[j]) {
	    			  int temp=num[i];
	    			  num[i]=num[j];
	    			  num[j]=temp;
	    		  }
	    	  }
	      }
		  for(int i=0;i<num.length;i++) {
			  if (num[i] < min) {
	              secondMin = min;
	              min = num[i];
	          } else if (num[i] < secondMin) {
	              secondMin = num[i];
	          }
		  }
		  System.out.println(min+" "+ secondMin);
	}
}
