package arrays.problems;

import java.util.Arrays;

/**
 * Two Sum (Brute Force Approach)
 *
 * Problem:
 * Given an integer array nums and an integer target, return the indices
 * of the two numbers such that they add up to the target.
 *
 * Assumptions:
 * - Exactly one valid solution exists
 * - You may not use the same element twice
 *
 * Example:
 * Input:  nums = {2, 7, 11, 15}, target = 9
 * Output: {0, 1}
 *
 * Approach:
 * - Use two nested loops to check every possible pair
 * - Start the inner loop from i + 1 to avoid using the same element twice
 * - Return immediately when the target sum is found
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class P07_TwoSum_BruteForce {

    public static int[] twoSum(int[] nums, int target) {

        // Traverse each pair in the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // Check if the current pair sums to the target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // Fallback return (problem guarantees one solution)
        return new int[0];
    }

    // Optional local testing
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Result indices: " + Arrays.toString(result));
    }
}
