package arrays.problems;

/*
Problem Statement:
Write a Java program to check whether two integer arrays
are permutations of each other.

Definition:
Two arrays are permutations if:
- They have the same length
- They contain the same elements
- The frequency of each element is the same
- Order does NOT matter

Brute Force Approach (O(n²)):
- For each element in the first array, search for a matching
  unused element in the second array
- Mark matched elements to handle duplicates correctly

Why Brute Force?
- Helps understand the core logic of permutations
- Does not use sorting or hash-based data structures
- Suitable for learning array fundamentals

Example:
Input:
array1 = {1, 2, 3, 4, 5}
array2 = {5, 1, 2, 3, 4}

Output:
true

Time Complexity: O(n²)
Space Complexity: O(n)  // boolean array for tracking used elements
*/

public class P10_Permutation_BruteForce {

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

        boolean[] used = new boolean[array2.length];

        for (int i = 0; i < array1.length; i++) {

            boolean found = false;

            for (int j = 0; j < array2.length; j++) {
                if (!used[j] && array1[i] == array2[j]) {
                    used[j] = true; // mark as used
                    found = true;
                    break;
                }
            }

            // If no matching element is found
            if (!found) {
                return false;
            }
        }

        return true;
    }
}