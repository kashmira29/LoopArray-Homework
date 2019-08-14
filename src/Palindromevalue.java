import java.util.Scanner;

public class Palindromevalue {
    public static void main(String args[])
    {
        // Find given number is palindrome number or not
        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        original = scanner.nextLine();

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("Entered number is a palindrome.");
        else
            System.out.println("Entered number is not a palindrome.");
    }
}
