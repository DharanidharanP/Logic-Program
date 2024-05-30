package Common_interview_questions;

public class Reverse_Sentence_word {

	
	public static String reverseSentenceWord(String str) {
		String []word=str.split(" ");
		String result="";
		for(int i=word.length-1;i>=0;i--) {
			if(i==0) {
				result =result +word[i];
			}else {
				result =result +word[i]+" ";
			}
		}
		return result ;
	}
	public static void main(String[] args) {
		
          String str="I love Hardwork";
		//String str=" love ";
     System.out.println( reverseSentenceWord(str));
	}

}
