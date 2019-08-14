public class SumOfArray {
    public static void main(String args[]){

        //sum of values of an array

       int a[]= {1,2,3,4,5};
       int n = a.length;
       int sum = 0;
       for(int i = 0; i < n ; i++)
       {
            sum = sum + a[i];
       }
       System.out.println("Sum of numbers: "+ sum);
    }
}
