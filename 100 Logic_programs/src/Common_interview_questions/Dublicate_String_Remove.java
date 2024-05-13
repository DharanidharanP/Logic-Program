package Common_interview_questions;

public class Dublicate_String_Remove {

	public static void main(String[] args) {
		String name="Dharan barbie";
		int count =0;
		char [] chars=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(chars[i]==chars[j]) {
					System.out.print(chars[j]);
					count++;
					break;
				}
			}
		}

	}

}
