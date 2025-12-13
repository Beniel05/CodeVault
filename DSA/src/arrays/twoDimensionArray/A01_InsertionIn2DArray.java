package arrays.twoDimensionArray;

public class A01_InsertionIn2DArray {

    static int[][] arr;
    static final int EMPTY = Integer.MIN_VALUE;

    public static void main(String[] args) {

        // Step 1: Create 2D array
        arr = new int[3][3];

        // Step 2: Initialize array
        initializeArray();

        // Step 3: Insert elements (row, col, value)
        insertValue(0, 0, 10);
        insertValue(1, 1, 20);
        insertValue(2, 2, 30);

        // Edge case: inserting into occupied cell
        insertValue(2, 2, 30);

        // Step 4: Display array (Without using Arrays.deepToString())
        displayArray();
    }

    // Time: O(rows × cols)
    // Space: O(1)
    static void initializeArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = EMPTY;
            }
        }
    }

    // Time: O(1)
    // Space: O(1)
    static void insertValue(int row, int col, int value) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length) {
            System.out.println("Invalid index");
            return;
        }

        if (arr[row][col] == EMPTY) {
            arr[row][col] = value;
            System.out.println("Inserted " + value + " at (" + row + "," + col + ")");
        } else {
            System.out.println("Cell already occupied. Cannot insert " + value + " at (" + row + "," + col + ')');
        }
    }

    // Time: O(rows × cols)
    // Space: O(1)
    static void displayArray() {
        System.out.println("\nFinal 2D Array:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == EMPTY) {
                    System.out.print("-   ");
                } else {
                    System.out.print(arr[row][col] + "  ");
                }
            }
            System.out.println();
        }
    }
}