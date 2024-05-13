package Leetcode;
import java.io.IOException;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxSum = findMaxHourglassSum(arr);
        System.out.println(maxSum);
    }

    private static int findMaxHourglassSum(int arr[][]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                int top = arr[i][x] + arr[i][x + 1] + arr[i][x + 2];
                int middle = arr[i + 1][x + 1];
                int bottom = arr[i + 2][x] + arr[i + 2][x + 1] + arr[i + 2][x + 2];
                int hourglassSum = top + middle + bottom;
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }
        return maxSum;
    }
}
