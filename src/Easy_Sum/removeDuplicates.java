package Easy_Sum;

import java.util.Arrays;

public class removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // index for next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // Main method to test in IntelliJ
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(nums);

        System.out.println("Unique count k = " + k);
        System.out.println("Array after removing duplicates: ");

        // Print only first k elements (unique ones)
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
