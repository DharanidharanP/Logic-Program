package Leetcode;



public class LongestPalindromicSubstring {
   public static void main(String[] args) {
   String s="babad";
   longestPlandromic(s);
}

private static void longestPlandromic(String s) {
	int len=s.length();
	String longest="";
	for(int i=0;i<len;i++) {
		for(int j=i+1;j<=len;j++) {
			String sub=s.substring(i,j);
			if(isPalindrom(sub) && sub.length()>longest.length()) {
				longest=sub;
			}
		}
	}	
	System.out.println("Longest palindromic substring: " + longest);
}

private static boolean isPalindrom(String sub) {
	int i=0;
	int j=sub.length()-1;
	System.out.println(j+"......");
	while(i<j) {
		if (sub.charAt(i) != sub.charAt(j)) {
            return false;
        }
		i++;
		j--;
	}
	return true;  
}
}
