package arrays.twoDimensionArray;

public class A06_DeletingElementIn2DArray {

    static int[][] arr = {
            {1, 33, 55, 91},
            {5, 4, 10, 11},
            {24, 50, 10, 40}
    };

    static final int EMPTY = Integer.MIN_VALUE;

    public static void main(String[] args){
        deleteIndex(0,3);
        deleteIndex(2,4);
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    static void deleteIndex(int rowIndex, int colIndex) {

        // IndexOutOfBound checking;
        if (rowIndex < 0 || rowIndex >= arr.length || colIndex < 0 || colIndex >= arr[rowIndex].length) {
            System.out.println("(" + rowIndex + "," + colIndex + ") Invalid index access");
            return;
        }

        System.out.println("Before deleting the element: " + arr[rowIndex][colIndex]);

        // Updating the given index's value as EMPTY ( -2^31 ) Logical deletion
        arr[rowIndex][colIndex] = EMPTY;
        System.out.println("Deleted element at Row: " + rowIndex + " Col: " + colIndex);

        System.out.println("After deleting the element: " + arr[rowIndex][colIndex]);
    }

}