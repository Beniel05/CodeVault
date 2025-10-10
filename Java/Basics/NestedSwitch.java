import java.util.Scanner;

public class NestedSwitch{
    // I have included both the traditional and modern switches. If you have any doubts visit the Switch.java file
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("- Random -");
        System.out.println("Your inputs should be either 1 or 2");

        int value1 = sc.nextInt(); // Getting 1 for fruits - 2 for vegetables
        
        switch (value1) { // Checking it's 1,2 or anything else
            
            case 1: // If it's 1 then this part will get executed alone
                System.out.println("\nYou choosed Fruits!");

                System.out.println("Choose 1 or 2 again, to know which fruit");
                int appleOrMango = sc.nextInt(); 

                switch (appleOrMango) {
                    case 1 -> System.out.println("\nThat is an Apple");
                    case 2 -> System.out.println("\nThat is a Mango");
                    default -> System.out.println("\nInvalid choice. It should be either 1 or 2");
                } 
                break; // Break statement of the first outer case

            case 2: // If the input is 2 this part will be executed alone
                System.out.println("\nYou choosed Vegetables!");

                System.out.println("Choose 1 or 2 again, to know which Vegetable");
                int carrotOrPotato = sc.nextInt();

                switch (carrotOrPotato) {
                    case 1:
                        System.out.println("\nThat's a Carrot");
                        break;
                    case 2:
                        System.out.println("\nThat's a Potato");
                        break;
                    default:
                        System.out.println("\nInvalid choice. It should be 1 or 2");
                } 
                break; // Breaking the second outer case

            default: // If both case 1 and case 2 are false, then default will get executed
                System.out.println("\nInvalid main choice. Please enter 1 or 2 only.");
        }

    }
}