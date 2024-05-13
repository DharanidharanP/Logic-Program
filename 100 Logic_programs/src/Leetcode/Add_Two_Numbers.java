package Leetcode;

public class Add_Two_Numbers {

	public static void main(String[] args) {
 
		int nums1[] = {1, 5, 3};
        int nums2[] = {4, 5, 5};
        
        int[] result = addArrays(nums1, nums2);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] addArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int sum = nums1[i] + nums2[i];
            if (sum == 10) {
                result[i] = 0;
            } else {
                result[i] = sum;
            }
        }
        
        return result;
	}

}
