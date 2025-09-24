/*
Given a Roman numeral string, convert it to its integer equivalent."
The rules for conversion are based on the values of seven symbols
(I=1,V=5,X=10,L=50,C=100,D=500,M=1000) and a subtraction rule.
When a symbol of a smaller value comes before a symbol of a larger value (e.g., IV or IX),
 you subtract the smaller value from the larger one.
 Otherwise, you add the values together.
 For example, IV=5−1=4 and MCMXCIV=1000+(1000−100)+(100−10)+(5−1)=1994.
The task is to write a function that takes the Roman numeral string and
returns the corresponding integer.
*/

package Easy_Sum;

import java.util.HashMap;

public class romanToInteger {
    public int demo(String s){
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total=0;
        int prevValue=0;

        for(int i=s.length()-1;i>=0;i--){
            int currentValue=romanMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
    public static void main(String[] args) {
        romanToInteger solution = new romanToInteger();

        // Example 1
        String s1 = "III";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.demo(s1)); // Expected output: 3
        System.out.println("--------------------");

        // Example 2
        String s2 = "LVIII";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.demo(s2)); // Expected output: 58
        System.out.println("--------------------");

        // Example 3
        String s3 = "MCMXCIV";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.demo(s3)); // Expected output: 1994
        System.out.println("--------------------");
    }
}


