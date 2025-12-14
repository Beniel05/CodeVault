package arrays.twoDimensionArray;

import java.util.Arrays;

public class A07_DeletingValuesIn2DArray {

    static int[][] arr = {
            {1, 33, 55, 91},
            {5, 4, 10, 11}, // first 10
            {24, 50, 10, 40} // second 10
    };

    static final int EMPTY = Integer.MIN_VALUE;

    public static void main(String[] args) {

        System.out.println("Before deleting: " + Arrays.deepToString(arr));
        deleteValues(10);
        System.out.println("After deleting: " + Arrays.deepToString(arr));
    }

    // Time Complexity: O(rows × columns) → O(mn)
    // Space Complexity: O(1)
    static void deleteValues(int value) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == value) {
                    arr[row][col] = EMPTY; // logical deletion
                }
            }
        }
    }
}