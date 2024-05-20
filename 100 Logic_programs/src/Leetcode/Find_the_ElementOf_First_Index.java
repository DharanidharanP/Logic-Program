package Leetcode;

public class Find_the_ElementOf_First_Index {

	public static void main(String[] args) {
    String  haystack="god to say good ";
    String needle="good";
   System.out.println(strStr(haystack,needle));
	}

	private static int strStr(String haystack, String needle) {
		 if (needle.isEmpty()) {
	            return 0;
	        }
	        int n = haystack.length(), m = needle.length();
	        System.out.println("haystack....."+n+"     needle....."+m);
	            if (n < m) {
	            return -1;
	        }
	        for (int i = 0; i <= n - m; i++) {
	            if (haystack.substring(i, i + m).equals(needle)) {
	            return i;
	            }
	        }
	        return -1;
	    }
		
	}


