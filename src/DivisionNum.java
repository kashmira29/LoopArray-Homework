public class DivisionNum {
    public static void main(String args[]){

        //Print the numbers divided by 3 & 5

        System.out.println("\nDivided by 3 :");
        for(int i = 1;i <=100;i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\nDivided by 5 :");
        for (int j = 1;j <= 100;j++){
                if(j%5==0)

                System.out.print(j + " ");
        }

    }
}
