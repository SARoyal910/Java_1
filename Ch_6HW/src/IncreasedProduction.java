import java.util.Scanner;

public class IncreasedProduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current number of parts produced: ");
        double production = input.nextDouble();

        int monthExceeded = -1;

        for (int month = 1; month <= 24; month++) {
            production = production * 1.06;
            System.out.printf("Month %2d: %.2f parts%n", month, production);
            if (monthExceeded == -1 && production > 10000) {
                monthExceeded = month;
            }
        }
        if (monthExceeded != -1) {
            System.out.println("Production exceeds 10,000 parts in month " + monthExceeded + ".");
        } else {
            System.out.println("The worker will not reach 10,000 parts production within 24 months.");
        }
    }
}


