package arrays.oneDimensionArray;

public class A03_AccessingElementInArray {

    /** Accesses and prints an element using try-catch */
    static void accessElement(String[] array, int index) {

        // Safety check to ensure the array is initialized before accessing elements
        if (array == null) {
            System.out.println("Array is not initialized.");
            return;
        }

        try {
            // Directly accessing the element
            String element = array[index];
            System.out.println("Element at index " + index + ": " + element);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid index access
            System.out.println("Invalid index: " + index);
        }
    }

    public static void main(String[] args) {

        // Step 1: Creating the array
        String[] array = {"a", "bat", "cat"};

        // Step 2: Accessing the elements using try-catch
        accessElement(array, 0);   // valid
        accessElement(array, 2);   // valid
        accessElement(array, 5);   // invalid index test
        accessElement(null, 1);    // null test
    }
}
