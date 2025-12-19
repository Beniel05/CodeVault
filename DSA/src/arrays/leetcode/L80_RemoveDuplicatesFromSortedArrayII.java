package arrays.leetcode;

import java.util.Arrays;

/**
 * LeetCode 80: Remove Duplicates from Sorted Array II
 *
 * Problem:
 * Given a sorted integer array, remove duplicates in-place such that
 * each element appears at most twice and return the number of valid elements.
 *
 * Constraints:
 * - Do not use extra space for another array
 * - Modify the input array in-place
 * - Extra space complexity must be O(1)
 *
 * Approach:
 * - Use the two-pointer technique
 * - Allow the first two elements by default
 * - Reject an element only if it matches both previously accepted elements
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class L80_RemoveDuplicatesFromSortedArrayII {

    public static int removeDuplicates(int[] nums) {

        // Arrays of size 2 or less are always valid
        if (nums.length <= 2) {
            return nums.length;
        }

        // k points to the next index where a valid element should be written
        int k = 2;

        // Traverse from the third element onward
        for (int i = 2; i < nums.length; i++) {

            // Accept the element unless it equals both previous accepted values
            if (nums[i] != nums[k - 1] || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        // k represents the logical size of the modified array
        return k;
    }

    // Optional local testing
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println("Given array : " + Arrays.toString(nums));
        System.out.print("Result: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
