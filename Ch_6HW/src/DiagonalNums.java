import java.util.Scanner;

public class DiagonalNums {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a single-digit integer: ");
        int n = kb.nextInt();

        for (int line = 0; line < 10; line++) {
            for (int space = 0; space < line; space++) {
                System.out.print(" ");
            }
            System.out.println(n);
        }
    }
}
