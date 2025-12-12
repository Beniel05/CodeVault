// True deletion isn't possible in fixed-size arrays,
// so we "logically delete" the element by storing Integer.MIN_VALUE.

package arrays.oneDimensionArray;

import java.util.Arrays;

public class A06_DeletingArrayElement {

    // Logical delete: mark the element as deleted by setting Integer.MIN_VALUE
    static String deleteElement(int[] arr, int index) {
        if (arr == null) return "Array is null.";
        if (index < 0 || index >= arr.length) return "Index out of bounds.";
        int oldValue = arr[index];
        arr[index] = Integer.MIN_VALUE; // mark as deleted
        return "Deleted index " + index + " (value " + oldValue + ")";
    }

    // Better visual display: show <deleted> instead of -2147483648
    static String visualArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(", ");

            // NOTE: if the actual value is Integer.MIN_VALUE, it will also appear as "<deleted>".
            if (arr[i] == Integer.MIN_VALUE) sb.append("<deleted>");
            else sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }


    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        int indexToDelete = 2; // zero-based -> deletes the 3rd element (30)

        System.out.println("Array before: " + Arrays.toString(array));

        String result = deleteElement(array, indexToDelete);
        System.out.println(result);

        System.out.println("Array after:  " + Arrays.toString(array));

        // Extra line: Better visual output
        System.out.println("Better visual output: " + visualArray(array));
    }
}