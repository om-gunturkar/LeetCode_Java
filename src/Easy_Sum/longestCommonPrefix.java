//Problem:
//Write a function that finds the longest common prefix string among an array of strings.
//
//If there is no common prefix, return an empty string "".

package Easy_Sum;
class Solution {
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}

public class longestCommonPrefix {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] input = {"flower", "flow", "flight"};
        String result = sol.longestCommonPrefix1(input);

        System.out.println("Longest Common Prefix: " + result);
    }
}
