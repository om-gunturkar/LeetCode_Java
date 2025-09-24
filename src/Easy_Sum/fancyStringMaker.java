//A fancy string is one where no three consecutive characters are the same.
// Given a string,
// the goal is to remove the minimum number of characters to make it fancy
// and return the unique final string.
//
//The provided Java code implements a straightforward solution to
// this problem by iterating through the input string and building
// a new string. For each character, it checks if adding it would create
// a sequence of three identical characters. If so, the character is skipped;
// otherwise, it is appended to the result.
//
//The solution uses a StringBuilder for efficient character appending
// and demonstrates its logic with three examples in the main method.

package Easy_Sum;
import java.lang.StringBuilder;
public class fancyStringMaker {

    public String makeFancyString(String s) {
        // Use a StringBuilder for efficient string manipulation.
        StringBuilder result = new StringBuilder();

        // Iterate through the input string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if adding the current character would create three consecutive characters.
            if (result.length() >= 2) {
                char lastChar = result.charAt(result.length() - 1);
                char secondLastChar = result.charAt(result.length() - 2);

                // If the current character is the same as the last two, skip it.
                if (currentChar == lastChar && currentChar == secondLastChar) {
                    continue; // Skip adding this character to the result
                }
            }

            // If the condition is not met, append the current character.
            result.append(currentChar);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        fancyStringMaker solution = new fancyStringMaker();

        // Example 1
        String s1 = "leeetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.makeFancyString(s1));
        System.out.println("Expected: leetcode");
        System.out.println("--------------------");

        // Example 2
        String s2 = "aaabaaaa";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.makeFancyString(s2));
        System.out.println("Expected: aabaa");
        System.out.println("--------------------");

        // Example 3
        String s3 = "aab";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.makeFancyString(s3));
        System.out.println("Expected: aab");
        System.out.println("--------------------");
    }
}
