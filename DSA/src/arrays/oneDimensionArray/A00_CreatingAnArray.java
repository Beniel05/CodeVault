package arrays.oneDimensionArray;

import java.util.Arrays;

public class A00_CreatingAnArray {
    public static void main(String[] args) {

        // 1. Declare - creates a reference to array
        int[] arrayName;

        // 2. Instantiation of an array - create an array
        arrayName = new int[3]; // All 3 elements are initialized to 0 by default

        // 3. Initialization - assigns values to cells in the array
        arrayName[0] = 10;
        arrayName[1] = 20;
        arrayName[2] = 30;

        System.out.println(Arrays.toString(arrayName));
        // Converts the array into a readable string format to print its elements instead of the memory reference

        System.out.print(arrayName);
        // This prints the internal memory reference of the array

    }
}
