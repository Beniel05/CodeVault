package arrays.problems;

/*
Problem Statement:
Given an integer array nums, return a new array containing the highest and second-highest distinct values from the array.
- The array may contain duplicate values
- If the array is null, has fewer than two elements, or does not contain two distinct values, return an empty array

Example 1
Input:  nums = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
Output: {90, 87}

Example 2
Input:  nums = {5, 5, 5}
Output: {}

Example 3
Input:  nums = {10}
Output: {}
* */

public class P03_FindTopTwoScores_1DArray {

    public static int[] findTopTwoScores(int[] array) {

        // Need at least two elements
        if (array == null || array.length < 2) {
            return new int[0];
        }

        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {

            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;

            } else if (score < firstHighest && score > secondHighest) {
                secondHighest = score;
            }
        }

        // Check if a valid second highest exists
        boolean hasSecond = false;
        for (int score : array) {
            if (score != firstHighest) {
                hasSecond = true;
                break;
            }
        }

        if (!hasSecond) return new int[0];

        return new int[]{firstHighest, secondHighest};
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] result = findTopTwoScores(nums);

        if (result.length == 0) {
            System.out.println("No second best score");
        } else {
            System.out.println(result[0] + ", " + result[1]);
        }
    }
}
