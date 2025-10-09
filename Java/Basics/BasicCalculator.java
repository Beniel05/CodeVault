import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while(true){

            System.out.println("\nAvoid using any other characters to avoid errors.");
            System.out.println("Enter X to exit");
            System.out.print("Choose the operator - ( + - * / % ): ");

            char op = sc.next().charAt(0);

            if (op=='X' || op=='x'){
                    System.out.println("Exiting the loop");
                    break;
            } 

            else if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {

                System.out.print("Enter the first value: ");
                int a = sc.nextInt();

                System.out.print("Enter the second value: ");
                int b = sc.nextInt();

                if(op=='+'){
                    ans = a+b;
                } else if(op=='-'){
                    ans = a-b;
                } else if(op=='*'){
                    ans = a*b;
                } else if(op=='/'){
                    if(b!=0){
                        ans = a/b;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        continue; // skip printing ans
                    }
                } else if(op=='%'){
                    if(b!=0){
                        ans = a%b;
                    } else {
                        System.out.println("Cannot modulo by zero!");
                        continue;
                    }
                } 
                System.out.println(ans);
            }

            else { 
                System.out.println("Invalid operation"); 
            }
        }
        sc.close();
    }
}
