import java.util.Arrays;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a phrase or statement: ");
        String input = kb.nextLine();

        if (input.isEmpty()) {
            System.out.println("No phrase or statement entered.");
        } else {
            String[] words = input.split("[\\p{Blank}\\p{Punct}]+");
            System.out.println("Word count = " + Arrays.stream(words).count());
        }
    }
}
