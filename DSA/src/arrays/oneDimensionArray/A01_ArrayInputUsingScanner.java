package arrays.oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class A01_ArrayInputUsingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            int num = i + 1; // Human-friendly numbering
            String suffix;

            if (num % 100 >= 11 && num % 100 <= 13) { // ANY number ending in 11, 12, 13
                suffix = "th";
            } else if (num % 10 == 1) {
                suffix = "st";
            } else if (num % 10 == 2) {
                suffix = "nd";
            } else if (num % 10 == 3) {
                suffix = "rd";
            } else {
                suffix = "th";
            }

            System.out.print("Enter value for the " + num + suffix + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
