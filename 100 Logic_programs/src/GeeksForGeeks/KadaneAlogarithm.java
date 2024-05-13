package GeeksForGeeks;

public class KadaneAlogarithm {

	public static void main(String[] args) {
		int num []= {-2, -3, 4, -1, -2, 1, 5, -3};
		int len=num.length;
		int subArray=maxSubArraySum(num,len);
		System.out.println(subArray);
	}

	public static int maxSubArraySum(int[] num, int len) {
		
		int max = Integer.MIN_VALUE, max_current_sum= 0;
		for(int i=0;i<len;i++) {
			
			max_current_sum = max_current_sum + num[i];
	       if(max<max_current_sum) {
	    	   max=max_current_sum;
	       }
	       
	       if(max_current_sum<0) {
	    	   max_current_sum=0;
	       }
	      // System.out.println("max_ending_here......: "+max_ending_here);
	       
		}
		return max;
	}

}
