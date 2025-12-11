package arrays.oneDimensionArray;

// Compact, reusable search methods.
public class A05_SearchingInArray {

    // Returns index of target in arr, or -1 if not present.
    static int indexOf(String[] arr, String target) {
        if (arr == null || target == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    // Case-insensitive search. Returns index or -1.
    static int indexOfIgnoreCase(String[] arr, String target) {
        if (arr == null || target == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(target)) return i;
        }
        return -1;
    }

    // Returns index of target in integer array, or -1 if not found.
    static int indexOf(int[] arr, int target) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        // Example arrays
        String[] names = {"Alice", "Beniel", "Bob", "Delta", "Zeta"};
        int[] numbers = {3, 14, 15, 92, 65};

        // get index => check => print message (printSearchResult)
        printSearchResult("Bob", indexOf(names, "Bob"));
        printSearchResult("bob", indexOf(names, "bob"));
        printSearchResult("bob (ignore case)", indexOfIgnoreCase(names, "bob"));

        printSearchResult(92, indexOf(numbers, 92));
        printSearchResult(100, indexOf(numbers, 100));
    }

    // Utility method for clean output
    static void printSearchResult(Object target, int index) {
        // // `target` can hold any type (String, Integer, etc.) because Object is the parent of all classes.
        if (index == -1) {
            System.out.println(target + ": No such element found in the given array");
        } else {
            System.out.println(target + ": Element found at index: " + index);
        }
    }
}
