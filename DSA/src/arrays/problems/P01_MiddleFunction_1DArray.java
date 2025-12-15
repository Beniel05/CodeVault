package arrays.problems;
/*
# Middle Function

## Problem Statement
Write a function called `middle` that takes an integer array and returns a **new array** containing all elements **except the first and the last**.
If the array has **two or fewer elements**, return an **empty array**.

## Example
Input:  [1, 2, 3, 4]
Output: [2, 3]

Input:  [1, 2]
Output: []
*/
import java.util.Arrays;

public class P01_MiddleFunction_1DArray {
    public static void main(String[] args) {

        int[] myArray2 = {1,2};
        int[] myArray3 = {1,2,3};
        int[] myArray4 = {1,2,3,4};

        System.out.println(Arrays.toString(middle(myArray2)));
        System.out.println(Arrays.toString(middle(myArray3)));
        System.out.println(Arrays.toString(middle(myArray4)));

    }

    static int[] middle(int[] arr){
        if (arr.length <= 2) {
            return new int[0];
        }

        int[] middleArray = new int[arr.length-2];

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        for (int index = 1; index < arr.length - 1; index++) {
            middleArray[index-1] = arr[index];
        }

        // The above loop in one line --> System.arraycopy(arr, 1, middleArray, 0, arr.length - 1 - 1);

        return middleArray;
    }
}
