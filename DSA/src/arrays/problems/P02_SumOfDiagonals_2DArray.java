package arrays.problems;

public class P02_SumOfDiagonals_2DArray {

    public static void main(String[] args) {

        // Sample 3x3 matrices (square matrices required for diagonal sums)
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr2 = {{1,2,3},{4,5,6},{0,8,9}}; // 0 in place of 7 for clarity

        // Sum of primary diagonal elements
        System.out.println(sumDiagonalElements(arr1));

        // Sum of anti-diagonal elements
        System.out.println(sumAntiDiagonalElements(arr2));
    }

    // Time Complexity: O(n) | Space Complexity: O(1)
    // Sums elements where row index == column index (primary diagonal)
    static int sumDiagonalElements(int[][] array) {

        int diagonalSum = 0;
        int length = array.length; // Number of rows (also columns for square matrix)

        for (int i = 0; i < length; i++) {
            // Primary diagonal condition: array[i][i]
            diagonalSum += array[i][i];
        }

        return diagonalSum;
    }

    // Time Complexity: O(n) | Space Complexity: O(1)
    // Sums elements where column index = (n - 1 - row index) (anti-diagonal)
    static int sumAntiDiagonalElements(int[][] array) {

        int antiDiagonalSum = 0;
        int length = array.length; // Matrix dimension

        for (int i = length - 1; i >= 0; i--) {
            // Maps (row, col) as:
            // row = length - 1 - i
            // col = i
            antiDiagonalSum += array[length - 1 - i][i];
        }
        return antiDiagonalSum;
    }
}