import java.util.Scanner;

public class SumOfEvenOddNo {
    private static Scanner sc;
    public static void main(String[] args)
        {
        //Find sum of Even and Odd numbers

        int Size, i, EvenSum = 0, OddSum = 0;;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();

        int [] a = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++)
        {
            a[i] = sc.nextInt();
        }

        for(i = 0; i < Size; i++)
        {
            if(a[i] % 2 == 0)
            {
                EvenSum = EvenSum + a[i];
            }
            else
            {
                OddSum = OddSum + a[i];
            }
        }
        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
        System.out.println(" The Sum of Odd Numbers in this Array = " + OddSum);
    }
}


