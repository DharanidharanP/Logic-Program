package Leetcode;

import java.util.Stack;

public class Valid_Parentheses {

    public static void main(String[] args) {
        String s = "()";
        boolean valid = isValid(s);
        System.out.println(valid);
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
        	 char c = s.charAt(i);
        	 System.out.println("charAt i= "+c);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                System.out.println(c+".....");
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; 
            }
        }
        return stack.isEmpty();
    }
}

/*
	private static boolean isValid(String s) {
		while(true) {
			if(s.contains("()")) {
				s=s.replaceAll("()","");
				System.out.println("().....s");
			}
			else if(s.contains("{}")) {
				s=s.replace("{}", "");
			}
			else if(s.contains("[]")) {
				s=s.replace("[]", "");
			}
			else {
				  return s.isEmpty();
			}
		}    
	}  */


