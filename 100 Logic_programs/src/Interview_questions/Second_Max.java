package Interview_questions;

public class Second_Max {

	public static void main(String[] args) {
		int no[]= {2,3,4,0,1,6,5};
		//int no[]= {2,5,-1,-6,10,7,0};
		int len =no.length;
		int max=0;
		int second_max=0;
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
		//System.out.print(no[i]+" ");
		if(max<no[i]) {
			second_max=max;
			max=no[i];
		}
		}
		System.out.println(max+"  "+second_max);
	}
}