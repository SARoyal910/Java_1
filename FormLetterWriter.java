import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();

        displaySalutation(firstName);
        displaySalutation(firstName, lastName);
    }

    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }
}

