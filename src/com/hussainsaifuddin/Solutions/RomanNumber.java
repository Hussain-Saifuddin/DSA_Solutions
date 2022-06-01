//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
// For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.
// Example 1:
//  Input: s = "III"
//  Output: 3
//  Explanation: III = 3.
// Example 2:
//  Input: s = "LVIII"
//  Output: 58
//  Explanation: L = 50, V= 5, III = 3.
// Example 3:
//  Input: s = "MCMXCIV"
//  Output: 1994
//  Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
// Constraints:
//  1 <= s.length <= 15
//  s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//  It is guaranteed that s is a valid roman numeral in the range [1, 3999].

package com.hussainsaifuddin.Solutions;

import java.util.Arrays;
import java.util.List;

public class RomanNumber {
    public static void main(String[] args) {
        OptimalRomanSolution("MCMXCIV");
    }
    public static int OptimalRomanSolution(String romanNumber){
        List<String> numbers = Arrays.asList(romanNumber.split(""));
        int result = -1;
        int prevValue = -1;
        int currentValue;
        for (String number: numbers) {
            currentValue = RomanCharacters.valueOf(number).getResponse();
            if(prevValue == -1){
                prevValue = currentValue;
                result = currentValue;
            } else if(prevValue != -1 && prevValue < currentValue){
                result = result + (currentValue - 2*prevValue);
                prevValue = currentValue;
            } else {
                result = result + currentValue;
                prevValue = currentValue;
            }
        }
        System.out.println("Result is : " + result);
        return result;
    }

    public enum RomanCharacters {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private int value;
        RomanCharacters(int value) {
            this.value = value;
        }
        public int getResponse(){
                return value;
        }
    }
}
