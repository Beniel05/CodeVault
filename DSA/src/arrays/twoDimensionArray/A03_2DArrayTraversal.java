package arrays.twoDimensionArray;

public class A03_2DArrayTraversal {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 33, 55, 91},
                {5, 4, 10, 11},
                {24, 50, 37, 40}
        };

        // Time Complexity: O(m × n)
        // Space Complexity: O(1)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }

    }
}
