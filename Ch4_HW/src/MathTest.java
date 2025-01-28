import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an int and a double
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();

        // a. The square root of the int
        double squareRoot = Math.sqrt(userInt);
        System.out.println("The square root of " + userInt + " is " + squareRoot);

        // b. A random number between 0 and the int
        double randomNumber = Math.random() * userInt;
        System.out.println("A random number between 0 and " + userInt + " is " + randomNumber);

        // c. The value of the floor, ceiling, and round of the double
        double floorValue = Math.floor(userDouble);
        double ceilingValue = Math.ceil(userDouble);
        long roundedValue = Math.round(userDouble);
        System.out.println("For the double " + userDouble + ":");
        System.out.println("  Floor value: " + floorValue);
        System.out.println("  Ceiling value: " + ceilingValue);
        System.out.println("  Rounded value: " + roundedValue);

        // d. The larger and smaller of the int and the double
        double largerValue = Math.max(userInt, userDouble);
        double smallerValue = Math.min(userInt, userDouble);
        System.out.println("Between " + userInt + " and " + userDouble + ":");
        System.out.println("  Larger value: " + largerValue);
        System.out.println("  Smaller value: " + smallerValue);
    }
}

