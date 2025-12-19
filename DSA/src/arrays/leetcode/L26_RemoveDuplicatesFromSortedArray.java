package arrays.leetcode;

/**
 * LeetCode 26: Remove Duplicates from Sorted Array
 *
 * Problem:
 * Given a sorted integer array, remove the duplicates in-place such that
 * each element appears only once and return the number of unique elements.
 *
 * Constraints:
 * - Do not use extra space for another array
 * - Modify the input array in-place
 * - Extra space complexity must be O(1)
 *
 * Approach:
 * - Use the two-pointer technique
 * - One pointer scans the array
 * - One pointer keeps track of the position to place the next unique element
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class L26_RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // Edge case: empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // k points to the next index where a new unique element should be written
        int k = 1;

        // Traverse the array starting from the second element (because the first element is unique already)
        for (int i = 1; i < nums.length; i++) {

            // If current-(index 1) element is different from the last-(index 0) accepted unique element
            if (nums[i] != nums[k - 1]) {

                // Place the unique element at index k
                nums[k] = nums[i];

                // Move k to the next position
                k++;
            }
        }

        // k is the number of unique elements
        return k;
    }

    // Optional: for local testing
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
