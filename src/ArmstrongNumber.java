import java.util.Scanner;

public class ArmstrongNumber {
        public static void main(String[] arg)
        {
            //input any number and check if it is Armstrong number or not

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int number, temp, total = 0;

        number = num;
        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }

        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

