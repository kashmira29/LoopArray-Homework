import java.util.Scanner;

public class CountWordsSpace {

        public static void main (String[]args){

            //Count the words and space in sentence

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any Sentence:");
            String sentence=scanner.nextLine();
            String[] count_word=sentence.split(" ");
            int word=0;
            for(int i=0;i<count_word.length;i++){
                word++;
            }
            System.out.println("Number of words : " + word);

            int space = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ')
                    space++;
            }
            System.out.println("Number of spaces : " + space );

        }
}


