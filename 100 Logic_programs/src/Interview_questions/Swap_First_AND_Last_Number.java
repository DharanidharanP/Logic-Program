package Interview_questions;

public class Swap_First_AND_Last_Number {

	public static void main(String[] args) {
		int[] no= {1,2,3,4,5};
		int len=no.length;
		int temp=no[0];
		for(int i=0;i<len;i++) {
			no[0]=no[len-1];
			no[len-1]=temp;	
			 System.out.print(no[i]+" ");
		}
      
	}

}
