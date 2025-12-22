package arrays.problems;

import java.util.Arrays;

/*
Problem Statement:
Write a Java program to find the pair of numbers in an array whose
product is maximum.

NOTE:
This solution uses a BRUTE FORCE approach.

Conditions:
- The array contains integers (can include negative numbers)
- At least two elements are required
- Return the pair that produces the maximum product

Brute Force Approach:
- Calculate the product of every possible pair using nested loops
- Track the maximum product found so far
- Store the corresponding pair

Why Brute Force?
- This is a practice problem for array fundamentals
- Useful for learning and small input sizes
- Easy to understand for beginners

Examples:
Example 1:
Input  : {1, 5, 3, 2}
Output : 5,3

Example 2:
Input  : {-10, -3, 5, 6}
Output : -10,-3

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class P09_MaxProductPair_BruteForce {

    public static void main(String[] args) {

        int[] exampleArray1 = {1, 5, 3, 2};
        int[] exampleArray2 = {-10, -3, 5, 6};

        System.out.println(Arrays.toString(exampleArray1));
        System.out.println("Max product pair = " + maxProduct(exampleArray1));

        System.out.println("\n" + Arrays.toString(exampleArray2));
        System.out.println("Max product pair = " + maxProduct(exampleArray2));
    }

    // Returns the pair of numbers with the maximum product
    static String maxProduct(int[] intArray) {

        if (intArray == null || intArray.length < 2) {
            return "";
        }

        int highestProduct = Integer.MIN_VALUE;
        String result = "";

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {

                int product = intArray[i] * intArray[j];

                if (product > highestProduct) {
                    highestProduct = product;
                    result = intArray[i] + "," + intArray[j];
                    // result = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }

        return result;
    }
}
