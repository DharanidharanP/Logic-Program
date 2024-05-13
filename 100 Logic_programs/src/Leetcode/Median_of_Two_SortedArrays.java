package Leetcode;

public class Median_of_Two_SortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 8, 17};
        int[] arr2 = {5,6,7,19, 21, 25};
        System.out.println(MedianTwoSortedArrays(arr1, arr2));
    }

    public static double MedianTwoSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] m = new int[len1 + len2];

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                m[k] = arr1[i];
                i++;
                k++;
            } else {
                m[k] = arr2[j];
                j++;
                k++;
            }
            
        }
        while (i < len1) {
            m[k] = arr1[i];
            i++;
            k++;
        }
        while (j < len2) {
            m[k] = arr2[j];
            j++;
            k++;
        }

        if ((len1 + len2) % 2 == 0) {
            int mid = (len1 + len2) / 2;
            return (double) (m[mid] + m[mid - 1]) / 2;
        } else {
            int mid = (len1 + len2) / 2;
            return m[mid];
        }
    }
}
