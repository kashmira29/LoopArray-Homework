public class TransposeMatrix {
    static final int N = 3;

    // Method for transpose matrix
    // of A[][] in B[][]
    static void transpose(int A[][], int B[][])
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                B[i][j] = A[j][i];
    }
    //Transpose matrix of two arrays
    public static void main (String[] args)
    {
        int A[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8 , 9}};

        int B[][] = new int[N][N], i, j;

        transpose(A, B);

        System.out.print("Result matrix is \n");
        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }
    }
}
