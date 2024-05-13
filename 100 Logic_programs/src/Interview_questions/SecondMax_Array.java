package Interview_questions;

public class SecondMax_Array {

	
	public static void main(String[] args) {
		  int [] num= {2,3,1,0,1,6,5,4};
		  int max=0;
		  int secondmax=0;
		  int thirdmax=0;
		  int len=num.length;
		  for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			if(num[i]>max) {
				thirdmax=secondmax;
				secondmax=max;
				max=num[i];
			}
			
		}
		System.out.print(max+" "+secondmax+" "+thirdmax);
	}
}
