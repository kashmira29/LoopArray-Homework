public class InsertElement {
    // Function to insert a given key in  the array.
    //  This function returns n+1 if insertion is successful, else n.
    static int insertSorted(int a[], int n, int value, int capacity)
    {
        // Cannot insert more elements if n is already more than or equal to capacity
        if (n >= capacity)
            return n;
        a[n] = value;
        return (n + 1);
    }
    public static void main (String[] args)
    {
        int[] a = new int[10];
        a[0] = 10;
        a[1] = 15;
        a[2] = 20;
        a[3] = 45;
        a[4] = 52;
        a[5] = 75;
        int capacity = 10;
        int n = 6;
        int i, value = 22;
        System.out.print("Before Insertion: ");
        for (i = 0; i < n; i++)
            System.out.print(a[i]+" ");
        // Inserting value
        n = insertSorted(a, n, value, capacity);

        System.out.print("\nAfter Insertion: ");
        for (i = 0; i < n; i++)
            System.out.print(a[i]+" ");
    }
}






