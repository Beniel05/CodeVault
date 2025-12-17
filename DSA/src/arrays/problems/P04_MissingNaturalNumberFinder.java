package arrays.problems;

import java.util.Arrays;

/*
Problem Statement:
Write a Java program to find the missing natural number from an array containing n-1 unique natural numbers.

Conditions:
- Numbers range from 1 to n
- Exactly one number is missing
- No duplicate elements

Approach:
- Use the formula for the sum of first n natural numbers: Sum = n * (n + 1) / 2
- Subtract the sum of elements present in the array from the expected sum

Examples:

Example 1: Input  : {1, 2, 3, 4, 6} | Output : 5
Example 2: Input  : {2, 3, 1, 5} | Output : 4

Time Complexity: O(n) | Space Complexity: O(1)
*/

public class P04_MissingNaturalNumberFinder {

    public static void main(String[] args) {

        int[] exampleArray1 = {1, 2, 3, 4, 6};
        int[] exampleArray2 = {2, 3, 1, 5};

        System.out.println(Arrays.toString(exampleArray1));
        System.out.println("Missing number = " + findMissingNumber(exampleArray1));

        System.out.println("\n" + Arrays.toString(exampleArray2));
        System.out.println("Missing number = " + findMissingNumber(exampleArray2));
    }

    // Returns the missing natural number from the array
    static int findMissingNumber(int[] arr) {

        int n = arr.length + 1; // one number is missing
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int number : arr) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }
}