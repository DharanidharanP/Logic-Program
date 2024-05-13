package Hacker_Rank;

import java.util.Scanner;

public class SubArray_Orginal {

	public static void main(String[] args) {
		 Scanner n = new Scanner(System.in);
		    int size = n.nextInt();
		    int[] arr = new int[size];
		   for(int i=0;i<size;i++) {
			   arr[i]=n.nextInt();
		   }
		   	int count = 0;
		   	for(int i=0;i<size;i++) {
		   		int sum=0;
		   		for(int j=i;j<size;j++) {
		   			sum=sum+arr[j];
		   			if(sum<0) {
		   				count ++;
		   			}
		   		}
		   	}
	   		System.out.println(count );
		   	
		   	
		    /*
		    int[][] arrM = new int[size][size];
		    int count = 0;
		    for(int i=0;i<size;i++){
		        arr[i] = in.nextInt();
		        System.out.println(arr[i]+"......");
		        if(arr[i] < 0) 
		        count++;
		        arrM[i][i] = arr[i];
		        System.out.println(arrM[i][i]+"......");
		        for(int j=0;j<i;j++){
		            arrM[j][i] = arrM[j][i-1]+arr[i];
		            if(arrM[j][i] < 0) 
		            count++;
		        }
		    }     */
		   // System.out.println(count);
	}

}
