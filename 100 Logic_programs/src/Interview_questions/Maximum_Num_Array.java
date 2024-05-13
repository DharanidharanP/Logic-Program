package Interview_questions;

public class Maximum_Num_Array {

	public static void main(String[] args) {
		int no[]= {2,5,-1,-6,10,7,0};
		int max=0;
		int len =no.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(no[i]<no[j]) {
				int temp=no[i];
				no[i]=no[j];
				no[j]=temp;
			}
		}
	}
       for(int i=0;i<len;i++) {
    	   if(no[i]>max) {
    		   max=no[i];
    	   }
       }
       System.out.println(max);
}
}
