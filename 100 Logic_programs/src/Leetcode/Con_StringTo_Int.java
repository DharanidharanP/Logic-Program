package Leetcode;

public class Con_StringTo_Int {

	public static void main(String[] args) {
		String s=" 0-1";

		String[] s1 = s.split(" ");
		int[] num = new int[s1.length]; 
		for (int i = 1; i < s1.length; i++) {
			try {
		        num[i] = Integer.parseInt(s1[i]);
		    } catch (NumberFormatException e) {
		    	e.printStackTrace();
		    }
			System.out.println(num[i]);
		}
	}

}
