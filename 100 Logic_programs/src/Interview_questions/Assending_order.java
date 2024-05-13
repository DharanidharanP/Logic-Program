package Interview_questions;

public class Assending_order {

	public static void main(String[] args) {
		int no []= {2,5,-1,-6,10,7,0};
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
			System.out.print(no[i]+" ");
		}
	}

}