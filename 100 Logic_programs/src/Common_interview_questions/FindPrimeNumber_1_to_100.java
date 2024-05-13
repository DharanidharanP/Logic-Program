package Common_interview_questions;
import java.util.Scanner;
public class FindPrimeNumber_1_to_100 {

	public static void main(String[] args) {
	
		int num=50;
		int j;
		
		for(int i=1;i<=num;i++) {
			for( j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.print(i+" ");
			}
		} 		}
		
	}
	

	/*
	 * 
	 * 
	 * 
	 * 
	 * public static String getSmallestAndLargest(String s, int k) { String smallest
	 * = s.substring(0, k); String largest = s.substring(0, k);
	 * System.out.println("smallest....."+smallest);
	 * System.out.println("largest......"+largest);
	 * System.out.println("K value...."+k); for (int i = 1; i <= s.length() - k;
	 * i++) { String currentSubstring = s.substring(i, i + k);
	 * System.out.println(" currentSubstring.........."+currentSubstring); if
	 * (currentSubstring.compareTo(smallest) < 0) { smallest = currentSubstring; }
	 * if (currentSubstring.compareTo(largest) > 0) { largest = currentSubstring; }
	 * } return smallest + "\n" + largest; }
	 * 
	 * 
	 * public static void main(String[] args) { Scanner scan = new
	 * Scanner(System.in); String s = scan.next(); int k = scan.nextInt();
	 * scan.close();
	 * 
	 * System.out.println(getSmallestAndLargest(s, k)); }
	 */
	
	
	/*
	 * public static void main(String[] args) { String name="java"; String dummy="";
	 * //System.out.println("yes...");
	 * 
	 * 
	 * for(int i=name.length()-1;i>=0;i--) { //dummy=name.charAt(i)+dummy; dummy =
	 * dummy + name.charAt(i); //System.out.println("dummy........"+dummy ); }
	 * System.out.println("dummy........"+dummy ); if(name.equals(dummy)){
	 * System.out.println("yes"); } else { System.out.println("No"); } }
	 */
	
	/*
	public static void main(String[] args) {
		
		String a="act";
		String b="cat";
		int count = 0;
		int alength=a.length();
		int blength=b.length();
		
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		
		if(alength==blength) {
			for(int i=0;i<alength;i++) {
				char ch=a1[i];
				for(int j=0;j<blength;j++) {
					if(ch==b1[j]) {
						
						count++;
						break;
					}
				}
			}
			if(count==blength) {
				System.out.println("yes");
			}else {
				System.out.println("No...");
			}
		}
		 
	}
}
*/