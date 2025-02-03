import java.time.LocalDate;
import java.util.Scanner;
public class PastPresentFuture2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter month (1-12): ");
        int month = kb.nextInt();
        System.out.println("Enter day (1-31): ");
        int day = kb.nextInt();
        System.out.println("Enter year: ");
        int year = kb.nextInt();

        LocalDate enteredDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        if(enteredDate.isBefore(today)) {
            System.out.println("The entered date is in the past");
        } else if(enteredDate.isAfter(today)) {
            System.out.println("The entered date is in the future");
        } else {
            System.out.println("The entered date is in the today");
        }
    }
}
