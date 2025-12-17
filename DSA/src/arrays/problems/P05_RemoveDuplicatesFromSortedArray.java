package arrays.problems;

import java.util.Arrays;

/*
Problem Statement:
Write a Java program to remove duplicate elements from a
SORTED integer array and return a new array with unique elements.

Condition:
- Array is already sorted
- Order must be preserved

Approach:
- Since duplicates are adjacent in a sorted array, compare each element with the previous one
- Store only unique elements in a new array

Example:
Input  : {1, 1, 2, 2, 3, 4, 5}
Output : {1, 2, 3, 4, 5}

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class P05_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] sortedArray = {1, 1, 2, 2, 3, 4, 5};

        System.out.println("Input  : " + Arrays.toString(sortedArray));
        System.out.println("Output : " + Arrays.toString(removeDuplicates(sortedArray)));
    }

    static int[] removeDuplicates(int[] arr) {

        if (arr.length == 0) return new int[0];

        int count = 1; // first element is always unique

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        int[] result = new int[count];
        result[0] = arr[0];

        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}
