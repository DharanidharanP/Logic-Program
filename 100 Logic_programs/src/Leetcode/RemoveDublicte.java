package Leetcode;

public class RemoveDublicte {

	public static void main(String[] args) {
		int arr[]= {1,1,2,-1};
		
		int len =arr.length;
		int temp =0;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		 len=removeDublicate(arr,len);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int removeDublicate(int[] arr, int len) {
		  int j = 1;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[i - 1]) {
	            	arr[j] = arr[i];
	                j++;
	            }
	        }
	        return j;
	      
		
	}

}
