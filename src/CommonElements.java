import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args)
    {
        String[] numArray1 = {"London", "Scotland", "Birmingham"};
        String[] numArray2 = {"Bombay", "manchester", "London", "Ireland",
                "Scotland", "Wales"};

        // Find Common Element in two arrays

        System.out.println("Common elements in two arrays : ");

        for(int i = 0; i < numArray1.length; i++)
        {
            for(int j = 0; j < numArray2.length; j++)
            {
                if(numArray1[i].equals(numArray2[j]))
                {
                    System.out.println(numArray1[i]);
                    break;
                }
            }
        }

    }


}


