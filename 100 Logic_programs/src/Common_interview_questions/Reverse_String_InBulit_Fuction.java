package Common_interview_questions;

public class Reverse_String_InBulit_Fuction {

	public static void main(String[] args) {
		String str="eibrab narahd";
		char[] chars = str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]+" ");
		}
		/*
		char chars[]=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
			
		
		System.out.println("   "+chars.length); */
	}

}
