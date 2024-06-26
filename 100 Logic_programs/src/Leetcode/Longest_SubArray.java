package Leetcode;

public class Longest_SubArray {

	
	
	public static int length_of_longest_substr(String s) {
        int[] chars = new int[128];
        int result = 0;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char right_char = s.charAt(j);
            chars[right_char]++;
            while (chars[right_char] > 1) {
                char left_char = s.charAt(i);
               chars[left_char]--;
                i++;
            }
            result = Math.max(result, j - i + 1);
            j++;
        }
        return result;
    }
	public static void main(String[] args) {
		String stringSubarray="abcabc";
		int subArrayCount=length_of_longest_substr(stringSubarray);
	System.out.println(subArrayCount);
	}

}
