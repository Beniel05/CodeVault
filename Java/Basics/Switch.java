import java.util.Scanner;

class Switch{

    // The switch's (expression) and the (case) should be in the same data type.
    // switch (fruit) -> case "Mango"
    // switch (number) -> case 1

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the day (1(Monday) - 7(Sunday)): ");
        int day = sc.nextInt();
        
        switch(day){
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            // Those above cases don't have a break statement so, the below program will get executed.
            // I did this because all (1-5) are Weekdays, 
            // so I just have to print Weekday - once if the value lies between 1 - 5
            
            System.out.println("Weekday");
            break; // This has a break statement. The section of code will be terminated
            
            case 6:
            case 7:
            System.out.println("Weekend");
            break;
            
            default:
                System.out.println("Enter a valid value between 1 and 7");
        }
        
        
        // Modern switch is available from Java 14 onward (officially stable in Java 17+).
        // Modern switch - don't need break statement to terminate.

        // switch (day) {
        //     case 1,2,3,4,5 -> System.out.println("Weekday"); // here the break statement is not required
        //     case 6,7 -> System.out.println("Weekend");
        //     default -> System.out.println("Enter a valid value between 1 and 7");
        // }
        
        sc.close();
    }
}