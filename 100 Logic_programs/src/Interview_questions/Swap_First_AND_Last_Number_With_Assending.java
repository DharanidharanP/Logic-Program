package Interview_questions;

public class Swap_First_AND_Last_Number_With_Assending {

	public static void main(String[] args) {
		int[] no= {1,3,4,2,5};
		int len=no.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(no[i]<no[j]) {
					int temp1=no[i];
					no[i]=no[j];
					no[j]=temp1;
				}
			}
		}
		int temp=no[0];
		for(int i=0;i<len;i++) {
		no[0]=no[len-1];
		no[len-1]=temp;{
		System.out.print(no[i]+" ");
		}
		}
       
	}

}
