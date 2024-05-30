package GeeksForGeeks;

public class AnagramCheckers {

	    public static boolean isAnagram(String a, String b) {
	        if (a.length() != b.length()) {
	            return false;
	        }
	        int[] charCounts = new int[256]; 
	        for (int i = 0; i < a.length(); i++) {
	            System.out.println(charCounts[a.charAt(i)]++); 
	            System.out.println(charCounts[b.charAt(i)]--); 
	        }
	        for (int i = 0; i < charCounts.length; i++) {
	            if (charCounts[i] != 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String input1 = "abcdeabsd";
	        String input2 = "sfasdfasf";

	        boolean result = isAnagram(input1, input2);
	        System.out.println("Are the strings anagrams? " + result);
	    }
	}



