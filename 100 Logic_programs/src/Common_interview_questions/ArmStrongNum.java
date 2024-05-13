package Common_interview_questions;

public class ArmStrongNum {

	public static void main(String[] args) {
		int no=153;
		int arm=0;
		int rem = 0;
		while(no>0) {
			 rem =no%10;
           arm=arm+(rem*rem*rem);
			no=no/10;
		}
		System.out.println(arm);
	}

}
