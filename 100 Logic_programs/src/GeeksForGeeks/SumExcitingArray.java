package GeeksForGeeks;

public class SumExcitingArray {

	public static void main(String[] args) {
	/*	Input: arr[] = {0, -1, 2, -3, 1}, x= -2
		Output: Yes
		Explanation: If we calculate the sum of the output,1 + (-3) = -2
*/
		
		
		int num[]= {0,-1,2,-3,1};
		int addResult=-2;  // 
		int size=num.length;
		if(check(num,size,addResult)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	private static boolean check(int[] num, int size, int addResult) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==addResult) {
					return true;
				}
			}
		}
		return false;
	}

}
