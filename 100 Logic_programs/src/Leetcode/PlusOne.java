package Leetcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int[] result = plusAdd(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] plusAdd(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
            	arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        System.out.println(n+"length......");
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
