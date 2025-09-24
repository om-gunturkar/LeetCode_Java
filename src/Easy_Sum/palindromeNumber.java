package Easy_Sum;

/**
 * 9. Palindrome Number
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * A palindrome is a number that reads the same forwards and backward.
 * The problem asks to solve this without converting the integer to a string.
 */
public class palindromeNumber {

    /**
     * Solution to Palindrome Number problem without converting the integer to a string.
     * This method reverses the second half of the number and compares it to the first half.
     *
     * @param x The integer to check.
     * @return true if x is a palindrome, false otherwise.
     */
    public boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome.
        // Also, if the number ends with a 0 (and is not 0 itself),
        // it cannot be a palindrome because the reversed number won't have a leading zero.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        // We'll build the reversed number only up to the point where it's half of the original.
        // This avoids potential integer overflow issues with very large numbers.
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // If the number has an even number of digits, like 1221,
        // x will equal revertedNumber (12 == 12).
        // If the number has an odd number of digits, like 121,
        // we can ignore the middle digit by dividing revertedNumber by 10.
        // So, 1 == 12 / 10.
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        palindromeNumber solution = new palindromeNumber();

        // Example 1
        int x1 = 121;
        System.out.println("Input: " + x1);
        System.out.println("Output: " + solution.isPalindrome(x1)); // Expected: true
        System.out.println("--------------------");

        // Example 2
        int x2 = -121;
        System.out.println("Input: " + x2);
        System.out.println("Output: " + solution.isPalindrome(x2)); // Expected: false
        System.out.println("--------------------");

        // Example 3
        int x3 = 10;
        System.out.println("Input: " + x3);
        System.out.println("Output: " + solution.isPalindrome(x3)); // Expected: false
        System.out.println("--------------------");

        // Example with an even number of digits
        int x4 = 1221;
        System.out.println("Input: " + x4);
        System.out.println("Output: " + solution.isPalindrome(x4)); // Expected: true
        System.out.println("--------------------");
    }
}