//🔹 Problem in Simple Words
//You’re given:
//A sorted array of distinct integers.
//A target number.
//You need to:
//Find the index of the target if it exists.
//If it does not exist, return the index where it should be inserted to keep the array sorted.
//⚡ Important: The solution must be O(log n) → that means binary search (not linear scan).
//🔹 Examples
//nums = [1, 3, 5, 6], target = 5 → found at index 2.
//nums = [1, 3, 5, 6], target = 2 → not found, but should be inserted at index 1.
//nums = [1, 3, 5, 6], target = 7 → not found, should be inserted at index 4 (end).
package Easy_Sum;

public class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                low = mid + 1; // search right side
            } else {
                high = mid - 1; // search left side
            }
        }

        // if target not found, 'low' is the insertion index
        return low;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        searchInsertPosition sip = new searchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        System.out.println(sip.searchInsert(nums, 5)); // Output: 2
        System.out.println(sip.searchInsert(nums, 2)); // Output: 1
        System.out.println(sip.searchInsert(nums, 7)); // Output: 4
        System.out.println(sip.searchInsert(nums, 0)); // Output: 0
    }
}

