package Common_interview_questions;

public class Fibinocis {

	public static void main(String[] args) {
		int num=8;
		int n1=0;
		int n2=1;
		int n3=0;
		
		for(int i=0;i<num;i++) {
			System.out.print(n3+" ");
	
		n1=n2;
		n2=n3;
		n3=n1+n2;
		}
	}

}
