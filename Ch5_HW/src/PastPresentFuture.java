import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();

        System.out.println("Enter month (1-12): ");
        int month = kb.nextInt();
        System.out.println("Enter day (1-31): ");
        int day = kb.nextInt();
        System.out.println("Enter year: ");
        int year = kb.nextInt();

        if (year != currentYear) {
            System.out.println("The entered date is not the current year.");
        } else {
            if (month < currentMonth) {
                System.out.println("The entered date is in an earlier month this year.");
            } else if (month > currentMonth) {
                System.out.println("The entered date is in a later month this year.");
            } else {
                System.out.println("The entered date is in the current month.");
            }
        }
    }
}
