package GeeksForGeeks;

public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		int num[]= { 5,3,-2,-6,-1,4 };
		int len=num.length;
		int sumResult=maxProduct(len,num);
        System.out.println("Max......."+sumResult);
	}

	private static int maxProduct(int len,int []num) {
		int result=num[0];
		
		for(int i=0;i<len;i++) {
			int multi=num[i];
			for(int j=i+1;j<len;j++) {
				result=Math.max(result,multi);
				 multi*=num[j];
			}
			result = Math.max(result, multi);
		}
		return result;
	}

}
