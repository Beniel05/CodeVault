package arrays.practice;

import java.util.Arrays;

public class ReturningNewArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int[] returnStatement = methodStatements(array);

        System.out.println(Arrays.toString(returnStatement));
    }

    static int[] methodStatements(int[] arr){
        int first = arr[0];
        int second = arr[1];
        return new int[]{first, second};
    }
}
