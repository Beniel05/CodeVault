package arrays.twoDimensionArray;

public class A05_CountOccurrencesIn2DArray {

    static final int[][] arr = {
            {1, 33, 55, 91},
            {5, 4, 10, 11}, // first 10
            {24, 50, 10, 40} // second 10
    };

    public static void main(String[] args) {

        countOccurrences(10);
        countOccurrences(60);
    }

    // Finds ALL occurrences and counts them
    static void countOccurrences(int tar) {

        int count = 0;

        // Time: O(rows × columns) = O(mn)
        // Space: O(1)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == tar) {
                    System.out.println("Found " + tar + " at Row: " + row + " Col: " + col);
                    count++;
                }
            }
        }

        if (count > 0) {
            System.out.println("Total occurrences of " + tar + ": " + count);
        } else {
            System.out.println("Element: " + tar + " not found in the array");
        }

    }
}