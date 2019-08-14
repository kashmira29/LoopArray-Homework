import java.util.Scanner;

public class TriangleUsingNestedForLoop {
    public static void main(String[] args) {
        // Display triangle using Nested for loop
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=s.nextInt();
        for(int i=1;i<=5;i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
