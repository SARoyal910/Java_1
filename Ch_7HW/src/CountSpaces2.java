import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your favorite quote: ");
        String quote = kb.nextLine();

        int spaceCount = 0;

        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Total number of spaces: " + spaceCount);
    }
}
