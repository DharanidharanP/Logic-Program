package GeeksForGeeks;

public class Maximum_of_all_subarrays {

		    public static void printMaxOfSubarrays(int[] arr, int k) {
		        int n = arr.length;
		        int check =n-k;
		      //  System.out.println(check+"...");
		        for (int i = 0; i <= n - k; i++) {
		            int max = arr[i];
		            for (int j = 1; j < k; j++) {
		                if (arr[i + j] > max) {
		                    max = arr[i + j];
		                    System.out.println("max..= "+max);
		                }
		            }
		            System.out.print("{start"+max + " }");
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		        int k = 3;
		        printMaxOfSubarrays(arr, k);
		    
	}

}
