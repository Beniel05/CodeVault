package arrays.twoDimensionArray;

import java.util.Arrays;

public class A00_Creating2DArray {
    public static void main(String[] args) {

        // Step 1 - Declare
        int[][] arrayName;

        // Step 2 - Instantiate
        arrayName = new int[2][2];

        // Step 3 - Initialize
        arrayName[0][0] = 1;
        arrayName[0][1] = 2;
        arrayName[1][0] = 3;
        arrayName[1][1] = 4;

        System.out.println(Arrays.deepToString(arrayName));

        System.out.println("\n========================================\n");

        int[][] int2DArray = {{1, 2}, {3, 4}};
        String[][] str2DArray = {{"Welcome to Java!"}, {"This is 2D Array"}};
        char[][] char2DArray = {{'a', 'b', 'c'}, {'y', 'z'}};

        // Single-line representations
        System.out.println("Single-line output:\n");
        System.out.println(Arrays.deepToString(int2DArray));
        System.out.println(Arrays.deepToString(str2DArray));
        System.out.println(Arrays.deepToString(char2DArray));

        System.out.println("\n========================================\n");

        // Row-by-row (matrix-like) output
        System.out.println("Row-by-row output (matrix style):\n");
        printRows(int2DArray);
        System.out.println(); // for empty line after the previous method's execution
        printRows(str2DArray);
        System.out.println(); // for empty line after the above method's execution
        printRows(char2DArray);
    }

    private static void printRows(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void printRows(String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void printRows(char[][] matrix) {
        for (char[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
