// Basic program to reverse a - Positive Integer value.

// Java’s int uses 32 bits (4 bytes). One bit is for the sign (positive/negative). The remaining 31 bits store the magnitude.
// 2^31 - 1 = 2,147,483,647

// This program will cause error when the integer value is greater than it's capacity as mentioned above.

import java.util.Scanner;

public class ReverseAPositiveInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer to be reversed: ");
        int value = sc.nextInt();

        System.out.print("The reversed number is: ");

        while(value>0){
            int result = value % 10; // To get the remainder we use "% Modulus" 
            System.out.print(result);
            value /= 10; // To get rid of the remainder || To get the quotient we use "/ Division"
        }


        // Another Basic - Easy and a simple method down below!
        // You can customize the program to get the num from the user
        
        // int num = 123456;
        // int ans = 0;
        // while(num>0){
        //     int rem = num % 10;   // takes the last digit
        //     num /= 10;          // removes that digit. (num = num / 10) => Both are same
        //     ans = ans * 10 + rem;   // builds the reversed number
        // }
        // System.out.println(ans);

        sc.close();
    }
}

