import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {

        final double ADULT_SELL_PRICE = 7.00;
        final double CHILD_SELL_PRICE = 4.00;


        final double ADULT_COST = 4.35;
        final double CHILD_COST = 3.10;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of adult meals: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter the number of child meals: ");
        int childMeals = input.nextInt();


        double totalAdultSell = adultMeals * ADULT_SELL_PRICE;
        double totalChildSell = childMeals * CHILD_SELL_PRICE;


        double totalAdultCost = adultMeals * ADULT_COST;
        double totalChildCost = childMeals * CHILD_COST;


        double totalAdultProfit = totalAdultSell - totalAdultCost;
        double totalChildProfit = totalChildSell - totalChildCost;
        double totalProfit = totalAdultProfit + totalChildProfit;


        System.out.printf("Total profit for adult meals: $%.2f\n", totalAdultProfit);
        System.out.printf("Total profit for child meals: $%.2f\n", totalChildProfit);
        System.out.printf("Grand total profit: $%.2f\n", totalProfit);
    }
}

