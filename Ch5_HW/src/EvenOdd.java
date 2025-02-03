import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = kb.nextInt();

        if (isEven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}
