import java.util.Scanner;

public class Simbols2 {
    public static void main(String args[]) {
        System.out.println("Enter your Word: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c))
                System.out.println(c + " <-- It is a Letter!");

            else if (Character.isDigit(c))
                System.out.println(c + " <-- It is a Number!");

            else if (Character.isSpaceChar(c)) ",.;:".contains(str);
            System.out.println(c + " <-- It is a Symbol!");
        }
    }
}