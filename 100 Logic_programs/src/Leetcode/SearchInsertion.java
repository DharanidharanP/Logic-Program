package Leetcode;

public class SearchInsertion {

	public static void main(String[] args) {
        int num[]= {1,2,3,5,6};
        int target=4;
		System.out.println(searchInsertion(num,target));
	}

	private static int  searchInsertion(int[] num, int target) {
		int start=0;
		int end =num.length;
		while(start<=end) {
			int mid=(start+end)/2; //1+6 =7/2= 3.5
			if(num[mid]==target) {
				return mid;
			}
			else if(num[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return start;
		
	}

}
