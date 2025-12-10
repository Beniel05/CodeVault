package arrays.oneDimensionArray;

import java.util.Arrays;

public class A02_InsertionInArray {

    // Constant to represent empty locations in the array
    static final int EMPTY = Integer.MIN_VALUE;

    // Static array reference (initially null)
    static int[] arr = null;

    /**
     * Creates an array of given size
     * and marks all locations as EMPTY
     */
    static void createArray(int size) {

        // Allocate memory for the array
        arr = new int[size];

        // Fill all positions with a default "empty" value
        Arrays.fill(arr, EMPTY);
    }

    /**
     * Inserts a value at a given index
     * Only inserts if the index is currently empty
     */
    static void insert(int index, int value) {

        // Safety check: if array is not created | when createArray() is not called
        if (arr == null) {
            System.out.println("Array is not created yet!");
            return;
        }

        try {
            // Check if the position is empty
            if (arr[index] == EMPTY) {

                // Insert the value at the given index
                arr[index] = value;
                System.out.println("Value added successfully!");

            } else {
                // If data already exists at that index
                System.out.println("Index already contains a value.");
            }

        } catch (IndexOutOfBoundsException e) {
            // Handles invalid index access
            System.out.println("Index is out of bounds.");
        }
    }

    public static void main(String[] args) {

        // Step 1: Create an array of size 3
        createArray(3);

        // Step 2: Insert values into the array
        insert(0, 10);
        insert(1, 20);
        insert(2, 30);
        insert(0, 11);    // overwrite test
        insert(21, 22);   // out-of-bounds test

        // Step 3: Display the final array
        System.out.println(Arrays.toString(arr));
    }
}
