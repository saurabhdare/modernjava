import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";

        var in = new Scanner(System.in);
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Entered string / number is a palindrome");
        } else {
            System.out.println("Entered string / number is NOT a palindrome");
        }
    }
}
