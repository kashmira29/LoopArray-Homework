import java.util.Scanner;

public class SumOfeachDigit {
    public static void main(String[] args)
    {
       //Enter the values of array calculate sum of each Digit
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
    }

    }
