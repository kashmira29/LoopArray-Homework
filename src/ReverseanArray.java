import java.util.Arrays;

public class ReverseanArray {
    // method that reverses array and stores it in another array
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is:" + Arrays.toString(b));
    }
    public static void main(String[] args)
    {
        int [] a = {10, 20, 30, 40, 50};
        reverse(a, a.length);
    }
}

