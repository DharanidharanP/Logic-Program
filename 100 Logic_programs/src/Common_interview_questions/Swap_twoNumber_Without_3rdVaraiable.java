package Common_interview_questions;

public class Swap_twoNumber_Without_3rdVaraiable {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		a=a+b; // a=2+3=5
		b=a-b; // b=5-3=2
		a=a-b; // a=5-2=3
		
		System.out.println(a+" "+b);
	}

}
