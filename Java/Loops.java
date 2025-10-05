public class Loops{
    public static void main(String[] args) {

        // n++ || n+=1 || n = n+1 --- All these three are the same

        //for loop
        System.out.println("For Loop");
        for (int i = 1; i <= 2; i=i+1) { //n++ || n+=1 || n = n+1
            System.out.println(i);
        }
        
        //while loop
        System.out.println("While Loop");
        int n = 1;
        while(n<=2){
            System.out.println(n);
            n+=1; // n++ || n+=1 || n = n+1
        }

        //do-while loop
        System.out.println("Do-while Loop");
        int n1 = 1;
        do{
            System.out.println(n1);
            n1++; // n++ || n+=1 || n = n+1
        } while (n1 <= 2);
    }
}
