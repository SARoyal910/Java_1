import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DaysTilNextMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for month, day, and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        try {
            // Create a LocalDate object for the entered date
            LocalDate currentDate = LocalDate.of(year, month, day);

            // Get the number of days in the current month
            int daysInMonth = currentDate.lengthOfMonth();

            // Calculate the remaining days until the next month
            int daysUntilNextMonth = daysInMonth - day;

            // Determine the name of the next month
            LocalDate firstDayNextMonth = currentDate.plusMonths(1).withDayOfMonth(1);
            String nextMonthName = firstDayNextMonth.getMonth().
                    getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();

            // Display the result
            System.out.println("There are " + daysUntilNextMonth + " days until " + nextMonthName + " starts.");
        } catch (Exception e) {
            System.out.println("Invalid date entered. Please ensure the month, day, and year are correct.");
        }
    }
}

