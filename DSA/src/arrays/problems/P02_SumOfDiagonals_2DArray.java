package arrays.problems;
/*
Problem Statement

Write two functions to calculate the sum of diagonal elements in a 2D integer array.
- `sumDiagonalElements` - returns the sum of 'primary diagonal' elements
- `sumAntiDiagonalElements` - returns the sum of 'anti-diagonal' elements

Definitions
- Primary Diagonal: `array[i][i]`
- Anti-Diagonal: `array[n - 1 - i][i]`
- Diagonals are defined only for square matrices (N × N)

Examples
- Example 1 – Primary Diagonal
Input: {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Output: 15
Explanation: 1 + 5 + 9 = 15

- Example 2 – Anti-Diagonal
Input: {
    {1, 2, 3},
    {4, 5, 6},
    {0, 8, 9}
};
Output: 8
Explanation: 0 + 5 + 3 = 8
*/


public class P02_SumOfDiagonals_2DArray {

    public static void main(String[] args) {

        // Sample 3x3 matrices (square matrices required for diagonal sums)
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr2 = {{1,2,3},{4,5,6},{0,8,9}}; // 0 in place of 7 for clarity

        System.out.println(sumDiagonalElements(arr1));
        System.out.println(sumAntiDiagonalElements(arr2));
    }

    // Time Complexity: O(n) | Space Complexity: O(1)
    // Sums elements where row index == column index (primary diagonal) ( 1 - 5 - 9 )
    static int sumDiagonalElements(int[][] array) {

        int diagonalSum = 0;
        int n = array.length; // Number of rows (also columns for square matrix)

        for (int i = 0; i < n; i++) {
            // Primary diagonal condition: array[i][i]
            diagonalSum += array[i][i];
        }

        return diagonalSum;
    }

    // Time Complexity: O(n) | Space Complexity: O(1)
    // Sums elements where column index = (n - 1 - row index) (anti-diagonal) ( 0 - 5 - 3 )
    static int sumAntiDiagonalElements(int[][] array) {

        int antiDiagonalSum = 0;
        int n = array.length; // Matrix dimension

        for (int i = 0; i < n; i++) {
            antiDiagonalSum += array[n - 1 - i][i];
        }

        return antiDiagonalSum;
    }
}