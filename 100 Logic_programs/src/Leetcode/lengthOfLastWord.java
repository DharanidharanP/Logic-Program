package Leetcode;

public class lengthOfLastWord {

	public static void main(String[] args) {
       String str="day";
      
       int lastlengthword=lastwordlength(str);
       System.out.println(lastlengthword+" ans");
	}

	private static int lastwordlength(String str) {
	   String[] word=str.split(" ");
	   int len=word.length;
		String result="";
		int wordlength=0;
		for(int i=len-1;i>=0;i--) {
			if(i==0) {
				result=result+word[i];
				 wordlength=result.length();
			}
			else {
			   result=result+word[i];
			   wordlength= result.length();
			   break;
			}
			break;
		}
		
		return wordlength;
	}

}
