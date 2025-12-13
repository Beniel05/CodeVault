package arrays.twoDimensionArray;

public class A02_AccessingElementIn2DArray {

 // static int[][] arr; - Use this declaration for null check .

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // 3x3 - 2D array

        accessCell(arr, 0, 2);   // valid
        accessCell(arr, 2, 1);   // valid
        accessCell(arr, 3, 0);   // invalid (edge case)
    }

    // Time: O(1)
    // Space: O(1)
    static void accessCell(int[][] array, int row, int col) {

        if (array == null) {
            System.out.println("Array is not initialized");
            return;
        }

        if (row < 0 || col < 0 || row >= array.length || col >= array[row].length) {
            System.out.println("Invalid index access");
            return;
        }

        System.out.println( "Accessing row: " + row + ", col: " + col +"\nCell value is: "
                + array[row][col] );
    }
}
