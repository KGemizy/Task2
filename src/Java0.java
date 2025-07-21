import java.util.Scanner;

public class Java0 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();

            String upperCaseSentence = sentence.toUpperCase();
            int length = sentence.length();
            char firstChar = sentence.charAt(0);

            System.out.println("Uppercase: " + upperCaseSentence);
            System.out.println("Length: " + length);
            System.out.println("First character: " + firstChar);
        }
    }


