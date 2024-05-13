package GeeksForGeeks;

public class RemoveDublicateArray {

	public static void main(String[] args) {
		int[] arr= {4,2,1,1,4,-1,3,5,2};
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		len=removeDublicate(arr,len);
		System.out.println();
		System.out.println("After remove dublicate......");
        for(int i=0;i<len;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

	private static int removeDublicate(int[] arr, int len) {
		
		int j=0;
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[len-1];
		return j;
	
	}

}
