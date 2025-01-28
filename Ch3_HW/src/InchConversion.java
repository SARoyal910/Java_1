import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in inches: ");
        int inches = scanner.nextInt();

        convertToFeet(inches);
        convertToYards(inches);
    }

    public static void convertToFeet(int inches) {
        double feet = inches / 12.0;
        System.out.println(inches + " inches is equal to " + feet + " feet.");
    }

    public static void convertToYards(int inches) {
        double yards = inches / 36.0;
        System.out.println(inches + " inches is equal to " + yards + " yards.");
    }
}
