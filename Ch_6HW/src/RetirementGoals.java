import java.util.Scanner;

public class RetirementGoals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yearsUntilRetirement;
        double annualSavings;

        do {
            System.out.print("Enter the number of years until retirement (must be > 0): ");
            yearsUntilRetirement = input.nextInt();
            if (yearsUntilRetirement <= 0) {
                System.out.println("Invalid entry. Please enter a positive number.");
            }
        } while (yearsUntilRetirement <= 0);

        do {
            System.out.print("Enter the amount of money you can save annually (must be > 0): ");
            annualSavings = input.nextDouble();
            if (annualSavings <= 0) {
                System.out.println("Invalid entry. Please enter a positive amount.");
            }
        } while (annualSavings <= 0);

        double totalSavings = yearsUntilRetirement * annualSavings;
        System.out.println("At retirement, you will have $" + totalSavings + " with no interest.");
    }
}

