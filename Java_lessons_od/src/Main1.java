import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        {
        System.out.println("\n Fibonacci series to " + num + " numbers are: " + Fibonacci(num));

        }
    }


    private static int Fibonacci(int num) {
        if (num < 2) {
            return num;
        } else {

            int Fib1 = 1,
                    Fib2 = 1,
                    Fibonacci = 1;

            for (int i = 3; i <= num; i++) {
                Fibonacci = Fib1 + Fib2;
                Fib1 = Fib2;
                Fib2 = Fibonacci;
                System.out.println(Fibonacci);

            }
            return Fibonacci;
        }
    }
}