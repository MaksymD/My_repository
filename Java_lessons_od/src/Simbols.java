import java.util.Scanner;

public class Simbols {
    public static void main(String args[]){
System.out.println("Enter your Word: ");
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        StringBuffer string = new StringBuffer(str);
        string.reverse();
        String revers = string.toString();
        System.out.println("revers of the word: "+revers);
    }
}
