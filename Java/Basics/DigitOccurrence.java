import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer value less than 2,147,483,647: "); // Storing Capacity of an integer
        int integerValue = sc.nextInt();

        System.out.print("Enter a single digit (0-9) to know its occurrence in that value: ");
        int digit = sc.nextInt();

        int count = 0;
        int temp = integerValue; // Just not to change the actual value, I'm taking it into a temporary variable

        while(temp>0){
            int lastValue = temp % 10; // To get the Remainder, use % - we're going to check from right to left
            if(lastValue == digit){
                count++;
            }
            temp = temp / 10; // temp /= 10;
            // The above line is used to get the Quotient. To get rid of the last digit
        }

        System.out.println("The total number of " + digit + " in " + integerValue + " is: " + count);

        sc.close();
    }
}
