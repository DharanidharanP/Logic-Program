package Interview_questions;

public class EvenNum_OddNum {

	

	public static void main(String[] args) {
       int arr[]= {1,2,3,4,5,6,7,8};
       int len=arr.length;
       int a[]=new int [arr.length];
      spiltEvenAndOdd(arr,a);
      for(int i=0;i<a.length;i++) {
    	   System.out.print(a[i]+" ");
       }
	}

	private static void spiltEvenAndOdd(int[] arr,int a[]) {
       //  int a[]=new int [arr.length];
        int index =0;
        int len=arr.length;
        for(int i=0;i<len;i++) {
        	if(arr[i]%2==0) {
        	a[index]=arr[i];
        	index++;
        	}
        }
        for(int i=0;i<len;i++) {
        	if(arr[i]% 2 !=0) {
        		a[index]=arr[i];
        		index ++;
        	}
        }
	}

}
