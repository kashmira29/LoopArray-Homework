import java.util.Arrays;

public class SortNumricStringArray {
    public static void main(String args[]) {

        // define number arrays
        int a[] = {10, 22, 3, 65, 5, 75};
        System.out.println("Number Arrays Before Sorting : " + Arrays.toString(a));
        // Soring number arrays
        Arrays.sort(a);
        System.out.println("Number Arrays After Sorting : " + Arrays.toString(a));

        // define string arrays
        String alphabet[] = {"sunday","monday","tuesday","wednesday","thursday","friday"};
        System.out.println("String Arrays Before Sorting : " + Arrays.toString(alphabet));
        // Sorting string arrays
        Arrays.sort(alphabet);
        System.out.println("String Arrays After Sorting : " + Arrays.toString(alphabet));
    }
}



