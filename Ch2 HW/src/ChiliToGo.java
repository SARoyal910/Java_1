import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of adult meals: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter the number of child meals: ");
        int childMeals = input.nextInt();


        double totalAdultCost = adultMeals * ADULT_MEAL_PRICE;
        double totalChildCost = childMeals * CHILD_MEAL_PRICE;
        double overallTotal = totalAdultCost + totalChildCost;


        System.out.printf("Total collected for adult meals: $%.2f\n", totalAdultCost);
        System.out.printf("Total collected for child meals: $%.2f\n", totalChildCost);
        System.out.printf("Overall total collected: $%.2f\n", overallTotal);
    }
}

