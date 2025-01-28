import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the job name: ");
        String jobName = scanner.nextLine();
        System.out.print("Enter the cost of materials: ");
        double materialCost = scanner.nextDouble();
        System.out.print("Enter the hours of work required: ");
        int workHours = scanner.nextInt();
        System.out.print("Enter the hours of travel time: ");
        int travelHours = scanner.nextInt();

        double estimate = calculateEstimate(materialCost, workHours, travelHours);
        System.out.println("The estimated price for " + jobName + " is $" + estimate);
    }

    public static double calculateEstimate(double materialCost, int workHours, int travelHours) {
        return materialCost + (workHours * 35) + (travelHours * 12);
    }
}

