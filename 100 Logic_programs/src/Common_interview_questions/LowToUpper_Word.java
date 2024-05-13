package Common_interview_questions;

public class LowToUpper_Word {

	public static void main(String[] args) {
	StringBuffer name =new StringBuffer("dHaRaNI");
	lowUpp(name);

	}

	private static void lowUpp(StringBuffer name) {
    int len=name.length();
    for(int i=0;i<len;i++) {
    	char c=name.charAt(i);
    	if(Character.isLowerCase(c)) {
    		name.setCharAt(i, Character.toUpperCase(c));
    	}
    	else {
    		name.setCharAt(i, Character.toLowerCase(c));

    	}
    }
    System.out.println(name);
	}

}
