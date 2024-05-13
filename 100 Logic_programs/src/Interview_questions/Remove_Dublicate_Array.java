package Interview_questions;

public class Remove_Dublicate_Array {

	public static void main(String[] args) {
		int[] arr= {4,2,1,1,4,-1,3,5,2};
         int len =arr.length;
         for(int i=0;i<len;i++) {
        	 for(int j=0;j<len;j++) {
        		 if(arr[i]<arr[j]) {
        			 int temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp;
        		 }
        	 }
         }
    	 System.out.println("len............."+len); 

       for(int i=0;i<len;i++) {
        	 System.out.print(arr[i]+" "); 
         } 
         System.out.println();
         len= removeDublicateElement(arr,len);
         for(int i=0;i<len;i++) {
        	 System.out.print(arr[i]+" ");
         }
	}

	public  static int removeDublicateElement(int[] arr, int n) {
		/*
		 * if(n==0 || n==1) { return n; }
		 */
		 int j=0;
		 System.out.println(" here n is length ..............."+n);
		 for(int i=0;i<n-1;i++) {
			 if(arr[i]!=arr[i+1]) {
				System.out.println("arr[i]...."+arr[i]+"..."+"arr[i+1]........"+arr[i+1]+"...");
			    arr[j++]=arr[i];
			 }
		 }
	       arr[j++]=arr[n-1];
	       return j;
	}

}
