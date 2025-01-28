import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the room (in feet): ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the room (in feet): ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the room (in feet): ");
        double height = scanner.nextDouble();

        double area = calculateWallArea(length, width, height);
        double gallons = calculateGallons(area);
        double price = calculatePrice(gallons);

        System.out.println("The total cost to paint the room is $" + price);
    }

    public static double calculateWallArea(double length, double width, double height) {
        return 2 * height * (length + width);
    }

    public static double calculateGallons(double area) {
        return area / 350.0;
    }

    public static double calculatePrice(double gallons) {
        return gallons * 32.0;
    }
}
