package Common_interview_questions;

public class Anagram {

	public static void main(String[] args) {
		String str1="act";
		String str2="cat";
		int count =0;
		char [] ch1=str1.toCharArray();
		char [] ch2=str2.toCharArray();
		if(ch1.length==ch2.length) {
			for(int i=0;i<ch1.length;i++) {
				char ch=ch1[i];
				for(int j=0;j<ch2.length;j++) {
					if(ch==ch2[j]) {
						count ++;
						break;
					}
				}
			}
		}
		if(count==ch2.length) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
	}

}
