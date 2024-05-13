package Common_interview_questions;

public class Vowels_in_String_Find {

	public static void main(String[] args) {
		String name="DHaraniuo";
		char ch[]=name.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'
				|| ch[i]=='o'|| ch[i]=='u' ) {
				System.out.print(ch[i]);
				count ++;
			}
		}
		System.out.println();
		System.out.println(count);

	}

}
