package Leetcode;

public class AddTwoArrays {
public static void main(String[] args) {
	int nums1[]= {1,5,3};
	int nums2[]= {4,5,5};
	int len1=nums1.length;
	int len2=nums2.length;
	int len3=len1+len2;
	int[] c = new int[len3]; 
	  int sum = addAndConcatenate(nums1, nums2);
      System.out.println(sum);
	//System.out.println("..............."+c.toString());
	
	
}
public static int addAndConcatenate(int[] nums1, int[] nums2) {
    int num1 = 0;
    for (int digit : nums1) {
        num1 = num1 * 10 + digit;
    }
    
    int num2 = 0;
    for (int digit : nums2) {
        num2 = num2 * 10 + digit;
    }

    return num1 + num2;
}
}
