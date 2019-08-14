import java.util.Scanner;

public class CountAinString {
    public static int count(String s, char c){
        //method to call in main method
        int res = 0;
        for (int i =0; i<s.length(); i++)
        {
            if (s.charAt(i) == c)
                res++;
        }
        return res;
        }
        //main method
        ////checking character 'a' in string
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Name : ");
        String str = scanner.next();
        char c = 'a';
        System.out.println("No of a in the string : " + count(str, c));
    }
}

