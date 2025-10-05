import java.util.Scanner;

public class Char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // \n - for new line
        System.out.print("Enter a character to check whether it's Upper Case or Lower Case.\nIf you enter a string, it will only check the first character.\nEnter the character: ");
        
        char ch = sc.next().charAt(0);
        // Use .trim() only when you're using nextLine() 
        // next() will automatically trims the empty spaes

        if(ch>='a' && ch<='z'){
            System.out.println("\n\tLowercase letter");
            // \t - for a tab space
        } else if(ch>='A' && ch<='Z') {
            System.out.println("\n\t Uppercase letter");
        } else {
            System.out.println("\n\t Sorry! It only works for alphabets.");
        }

        // You can also use the "Character.isLowerCase(ch) || Character.isUpperCase(ch)"

        // if (Character.isLowerCase(ch)) {
        //     System.out.println("\n\tLowercase letter");
        // } else if (Character.isUpperCase(ch)) {
        //     System.out.println("\n\tUppercase letter");
        // } else {
        //     System.out.println("\n\tSorry! It only works for alphabets.");
        // }

        sc.close();
    }
}