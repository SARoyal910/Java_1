import java.util.Scanner;

public class TriangleWithLoops {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a single digit: ");
        int digit = kb.nextInt();
        String pattern = "";

        for(int line =  1; line <= 7; line++) {
            for(int space = 1; space <= (7 - line); space++) {
                pattern += " ";
            }
            for (int count = 1; count <= line; count++) {
                pattern += digit;
                if (count < line) {
                    pattern += " ";
                }
            }
            pattern += "\n";
        }
        System.out.println(pattern);
    }
}
