import java.util.Scanner;

public class SumOfNaturalNo {

public static void main(String[] args)
    {
        // Sum of natural numbers

    int i, n, sum=0;
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        n = scanner.nextInt();
    }
    System.out.println("The first n natural numbers are : "+n);

    for(i=1;i<=n;i++)
    {
        System.out.println(i);
        sum+=i;
    }
    System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

}
}

