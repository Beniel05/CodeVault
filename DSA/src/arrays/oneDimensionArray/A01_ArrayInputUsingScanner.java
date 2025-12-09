package arrays.oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class A01_ArrayInputUsingScanner {
    public static void main(String[] args) {

        // Used to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Validating the array size
        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        // Creating the array with the given size
        int[] arr = new int[n];

        // Loop to take array elements from the user
        for (int i = 0; i < n; i++) {

            int num = i + 1; // Human-friendly position (1st, 2nd, 3rd...)
            String suffix;

            // Handling special cases like 11th, 12th, 13th
            if (num % 100 >= 11 && num % 100 <= 13) {
                suffix = "th";
            }
            // Handling normal ordinal suffixes
            else if (num % 10 == 1) {
                suffix = "st";
            } else if (num % 10 == 2) {
                suffix = "nd";
            } else if (num % 10 == 3) {
                suffix = "rd";
            } else {
                suffix = "th";
            }

            // Asking user for the element value
            System.out.print("Enter value for the " + num + suffix + " element: ");
            arr[i] = sc.nextInt();
        }

        // Printing the complete array in readable format
        System.out.println(Arrays.toString(arr));

        // Closing the scanner to free resources
        sc.close();
    }
}
