import java.util.Arrays;

public class IndexOfArray {
        // method  to implement
        // find the index of an array element
        static int findElement(int a[], int n, int value)
        {
            for (int i = 0; i < n; i++)
                if (a[i] == value)
                    return i;
            return -1;
        }
        // main method
        public static void main(String args[])
        {
            int a[] = {10, 20, 30, 40, 50};
            int n = a.length;

            // Using a value 40 as search element
            int value= 40;
            int position = findElement(a, n, value);

            if (position == - 1)
                System.out.println("Element not found");
            else
                System.out.println("Element Found at Position: "
                        + (position + 1));
        }
    }


