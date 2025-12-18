package arrays.problems;

import java.util.Arrays;

/*
Problem Statement:
Write a Java program to remove duplicate elements from an
UNSORTED integer array and return a new array containing only unique elements.

Conditions:
- Array is NOT sorted
- Order of first occurrence must be preserved
- No HashMap / HashSet is used

Approach:
- For each element, check whether it has appeared before
- If it has appeared, skip it
- Otherwise, add it to the result array

Example:
Input  : {3, 1, 2, 3, 2, 4, 1}
Output : {3, 1, 2, 4}

Time Complexity: O(n^2)
Space Complexity: O(n)
*/

public class P06_RemoveDuplicatesFromUnsortedArray {

    public static void main(String[] args) {

        int[] unsortedArray = {3, 1, 2, 3, 2, 4, 1};

        System.out.println("Input  : " + Arrays.toString(unsortedArray));
        System.out.println("Output : " + Arrays.toString(removeDuplicates(unsortedArray)));
    }

    static int[] removeDuplicates(int[] arr) {

        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // Check if current element appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        // Return array with exact size
        return Arrays.copyOf(temp, index);
    }
}
