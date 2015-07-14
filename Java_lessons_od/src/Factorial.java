import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            System.out.print("Enter the number: ");
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            {
                System.out.println("\n Factorial for " + num1 + " is : " + Fact(num1));
            }
        }
    private static int Fact(int num1) {
        if (num1==0) {
            return 1;
        } else {

            int fact = 1;

            for (int i=1; i<=num1; i++) {
                fact *= i;
                           }
            {
                return fact;
            }
        }
    }
}


