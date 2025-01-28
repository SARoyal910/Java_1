import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        FitnessTracker defaultTracker = new FitnessTracker();

        // Prompting user for values
        System.out.print("Enter the activity: ");
        String activity = scanner.nextLine();

        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter the date (YYYY-MM-DD): ");
        String dateInput = scanner.next();
        LocalDate date = LocalDate.parse(dateInput);

        // Using overloaded constructor
        FitnessTracker userTracker = new FitnessTracker(activity, minutes, date);

        // Displaying details of the default tracker
        System.out.println("\nDefault Fitness Tracker:");
        System.out.println("Activity: " + defaultTracker.getActivity());
        System.out.println("Minutes: " + defaultTracker.getMinutes());
        System.out.println("Date: " + defaultTracker.getDate());

        // Displaying details of the user-provided tracker
        System.out.println("\nUser Fitness Tracker:");
        System.out.println("Activity: " + userTracker.getActivity());
        System.out.println("Minutes: " + userTracker.getMinutes());
        System.out.println("Date: " + userTracker.getDate());
    }
}

