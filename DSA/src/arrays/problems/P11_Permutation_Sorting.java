package arrays.problems;

import java.util.Arrays;

/*
Problem Statement:
Write a Java program to check whether two integer arrays
are permutations of each other.

Optimized Approach (Sorting - O(n log n)):
- If two arrays are permutations, sorting them will produce
  identical arrays
- Sort both arrays
- Compare elements one by one

Why Sorting?
- Much faster than brute force
- Cleaner and shorter code
- Uses Java’s optimized inbuilt sorting

NOTE:
- This approach modifies the input arrays
- If input arrays must not be modified, create copies before sorting

Example:
Input:
array1 = {1, 2, 3, 4, 5}
array2 = {5, 1, 2, 3, 4}

Output:
true

Time Complexity: O(n log n)
Space Complexity: O(1) / O(log n) (depends on JVM implementation)
*/

public class P11_Permutation_Sorting {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 1, 2, 3, 4};

        System.out.println(isPermutation(array1, array2));
    }

    static boolean isPermutation(int[] array1, int[] array2) {

        // Length check
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
