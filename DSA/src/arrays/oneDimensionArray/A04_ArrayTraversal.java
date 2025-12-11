package arrays.oneDimensionArray;

/**
 * Different approaches to safely traverse an array:
 * 1. Normal traversal when the array is properly initialized.
 * 2. Null-check before traversal (recommended in real applications).
 * 3. Exception handling example when attempting to traverse a null array.
 */
public class A04_ArrayTraversal {

    /**
     * Traverses a valid array and prints each element.
     */
    private static void traverseNormally() {
        String[] array = {"Hello World!", "", "\tby Java"};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Traverses an array only if it is non-null.
     * Prevents NullPointerException by validating the reference.
     */
    private static void traverseWithNullCheck() {
        String[] array = null; // array reference has no associated object

        if (array == null) {
            System.out.println("Cannot traverse: array is not initialized.");
            return;
        }

        // Enhanced for-loop (more concise)
        for (String element : array) {
            System.out.println(element);
        }
    }

    /**
     * Demonstrates how a NullPointerException can be caught
     * during array traversal when the array reference is null.
     */
    private static void traverseWithTryCatchDemo() {
        String[] array = null; // array reference has no associated object

        try {
            for (String element : array) { // triggers NullPointerException
                System.out.println(element);
            }
        } catch (NullPointerException ex) {
            System.out.println("Caught NullPointerException: array is null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Normal traversal:");
        traverseNormally();

        System.out.println("\n2. Traversal with null-check:");
        traverseWithNullCheck();

        System.out.println("\n3. Traversal with exception handling:");
        traverseWithTryCatchDemo();
    }
}
