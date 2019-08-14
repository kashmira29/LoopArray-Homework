import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {

        //Print Multiplication table by entering number of raw and column

        System.out.print("Multiplication table\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any row number:");
        int row = scanner.nextInt();
        System.out.println("Enter any column number:");
        int col = scanner.nextInt();
        int y;
        System.out.println("multiplication table");
        int i=1;
        do
        {
            int j=1;
            do
            {
                y=i*j;
                System.out.print(" "+y);
                j=j+1;
            }
            while(j<=col);
            System.out.println("\n");
            i=i+1;
        }
        while(i<=row);

    }
}


