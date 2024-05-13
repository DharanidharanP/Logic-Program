package Common_interview_questions;

public class ReverseSrtring_Inbuilt_Function {

	public static void main(String[] args) {
		String name="eibrab narahd"; 
		int len=name.length();
		String reverse="";
		for(int i=len-1;i>=0;i--) {
			reverse=reverse +name.charAt(i);
		}
		System.out.println(reverse);
		if(name.equals(reverse)) {
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");

	}

}
