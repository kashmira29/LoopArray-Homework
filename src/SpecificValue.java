public class SpecificValue {

    public static boolean contains(int[] arry, int item) {
        int n = arry.length;
        for (int i = 0; i < n; i++) {
            if (item == arry[i]) {
                System.out.println("An array contains a specific value " + item );
                return true;
            }
        }
        System.out.println("An array not contains a specific value " + item );
        return false;
    }
    public static void main(String args[]){
        int a[] = {10,20,30,40,55};
        System.out.println(contains(a,30));
        System.out.println(contains(a,51));
    }
}
