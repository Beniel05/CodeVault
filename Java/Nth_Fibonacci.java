// Simple and basic Fibonacci program using int!

// Using int, n can be safely calculated up to 46
// Using long, n can be safely calculated up to 93
// Using BigInteger, n can be calculated for practically any number

import java.util.Scanner;
public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int previous = 0; // Declaring the first value (0)
        int current = 1; // Declaring the second value (0,1)
        // next value for 3 => (0,1,1) <= "previous+next"
        
        int count = 2; // for getting nth Fibonacci when the n is greater than 2 
        // already have first two values so starting with 2

        while(n > count){
            int temp = current; // storing the current value to a temporary variable 
            current = previous + current; // changing the current value by "previous + current"
            previous = temp; // storing the highest value to the previous => next's value to previous 
            count++;
        }

        
        // This part is not important just to make the output looks good. 
        String suffix;
        if (n % 100 >= 11 && n % 100 <= 13)
        suffix = "th";
        else if (n % 10 == 1)
        suffix = "st";
        else if (n % 10 == 2)
        suffix = "nd";
        else if (n % 10 == 3)
        suffix = "rd";
        else
        suffix = "th";
        // If you want 1st,2nd,3rd,4th for the n - then include the above part 


        // If you haven't added the suffix part, then use this line instead:
        // System.out.println("The " + n + " Fibonacci value is: " + previous);
        // System.out.println("The " + n + " Fibonacci value is: " + current); - Respectively
        if(n==1){
            // If n = 1, print the first value directly
            System.out.println("The " + n + suffix +" Fibonacci number is: " + previous); 
        } else if(n==2){
            // If n = 2, print the second value directly
            System.out.println("The " + n + suffix + " Fibonacci number is: " + current); 
        } else {
            // This only runs when the n is > 2. Output of the while loop
            System.out.println("The " + n + suffix + " Fibonacci number is: " + current); 
        }

        sc.close();
    }
}
