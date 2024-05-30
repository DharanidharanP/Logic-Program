package Leetcode;

public class BinaryAdd {

    public static void main(String[] args) {
        String a = "11";
        String b = "111";
        int i = 0, carry = 0;
        int alen = a.length();
        int blen = b.length();
        StringBuilder result = new StringBuilder();

        while (i <alen||i<blen || carry!=0) {
            int x= 0;
            if (i< alen && a.charAt(alen -i-1) == '1') {
                x= 1;
            }
            int y= 0;
            if (i<blen && b.charAt(blen -i - 1) == '1') {
                y =1;
            }
            int sum= x+y + carry;
            result.insert(0, sum % 2);  
            carry = sum / 2;
            i++;
        }
        System.out.println(result.toString());
    }
}
