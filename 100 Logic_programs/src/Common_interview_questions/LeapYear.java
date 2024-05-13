package Common_interview_questions;

public class LeapYear {

	public static void main(String[] args) {
		int year=2000;
		boolean leap=false;
		if(year%400==0) {
			//System.out.println("leap year");
			 if(year%100==0) {
				//System.out.println("not leap year");
				 
			}
			 if(year%4==0) {
				//System.out.println("leap year");
				 leap=true;
			}
			 else {
				 leap=false;
			 }
			 leap=true;
		}
		else {
			leap=false;
		}
		System.out.println(leap);
	}

}
