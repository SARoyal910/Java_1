import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter max talk minutes needed: ");
        int minutes = kb.nextInt();
        System.out.println("Enter max text messages needed: ");
        int texts = kb.nextInt();
        System.out.println("Enter max gigabytes of data needed: ");
        double data = kb.nextDouble();

        String plan;
        double cost;
        if (data > 0) {
            plan = (data <= 3) ? "Plan E ($79)" : "Plan F ($87)";
        } else if (minutes < 500) {
            plan = (texts == 0) ? "Plan A ($49)" : "Plan B ($55)";
        } else {
            plan = (texts <= 100) ? "Plan C ($61)" : "Plan D ($70)";
        }

        System.out.println("Recommended plan: " + plan);

    }
}
