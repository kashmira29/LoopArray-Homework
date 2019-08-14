import java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args)
    {
        // create different integers arrays and compare
        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = new int [] {1, 2, 3, 4};
        int[] arr3 = new int [] {1, 2, 4, 3};

        System.out.println("arr1 equals to arr2 : " +
                Arrays.equals(arr1, arr2));
        System.out.println("arr1 equals to arr3 : " +
                Arrays.equals(arr1, arr3));
    }
}

