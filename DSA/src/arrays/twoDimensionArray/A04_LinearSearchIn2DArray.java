package arrays.twoDimensionArray;

// This program only prints the first occurrence of the element we're searching
// The next program (A05_CountOccurrenceIn2DArray) - will return the number of times the element got repeated

public class A04_LinearSearchIn2DArray {

    static final int[][] arr = {
            {1, 33, 55, 91},
            {5, 4, 10, 11},
            {24, 50, 10, 40} // Second 10 at Row: 2, Col: 2
    };

    public static void main(String[] args) {

        searchElement(10);
        searchElement(60);

    }

    // Finds FIRST occurrence only
    static void searchElement(int tar) {

        // Time: O(rows × columns) = O(mn)
        // Space: O(1)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == tar) {
                    System.out.println("Found " + tar + " at Row: " + row + " Col: " + col
                    );
                    return; // stop at first match
                }
            }
        }
        // Only runs when there is no match
        System.out.println("Element " + tar + " not found in the array");
    }
}