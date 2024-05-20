package Leetcode;
import java.util.*;

public class RomanToInteger {
    private Map<Character, Integer> romanValues;

    public static void main(String[] args) {
        RomanToInteger romanint = new RomanToInteger();
        String s = "MCMXCIV";
        int result = romanint.romanToInt(s);
        System.out.println("Result: " + result); 
    }

    public RomanToInteger() { 
        romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        System.out.println(s.length());
      //  MCMXCIV
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanValues.get(s.charAt(i));
           // System.out.println(curValue);
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
            System.out.println(result);
        }
        return result;
    }
}
