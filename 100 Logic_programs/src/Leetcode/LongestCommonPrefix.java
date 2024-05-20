package Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "lader", "ant", "ananth"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String prefix = lcp.longestCommonPrefix(str);
        System.out.println("Longest Common Prefix: " + prefix);
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int idx = 0;
        while(idx < first.length() && idx < last.length()){
            if(first.charAt(idx) == last.charAt(idx)){        
            	idx++;
            }
        }

        return first.substring(0, idx);
    }
}
