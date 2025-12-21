package arrays.problems;

/*
Problem Statement:
Write a Java program to check whether a given number exists
in an integer array and return its index.

If the number is not found, return -1.

Approach:
- Traverse the array element by element
- Compare each element with the target value
- Return the index as soon as a match is found

Example:
Input  : {1, 2, 3, 4, 5, 6}, value = 6
Output : 5

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class P08_SearchElementIn1DArray {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int valueToSearch = 6;

        System.out.println("Index : " + searchInArray(intArray, valueToSearch));
    }

    static int searchInArray(int[] arr, int valueToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == valueToSearch) {
                return index;
            }
        }

        return -1; // element not found
    }
}
