import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double DOZEN_PRICE = 3.25;
        final double LOOSE_EGG_PRICE = 0.45;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of eggs: ");
        int eggsOrdered = input.nextInt();


        int dozens = eggsOrdered / 12;
        int leftover = eggsOrdered % 12;


        double costForDozens = dozens * DOZEN_PRICE;
        double costForLeftover = leftover * LOOSE_EGG_PRICE;
        double totalCost = costForDozens + costForLeftover;


        System.out.printf("You ordered %d eggs. That's %d dozen at $%.2f per dozen and %d loose eggs at %.2f cents each",
                eggsOrdered, dozens, DOZEN_PRICE, leftover, LOOSE_EGG_PRICE);
        System.out.printf(" for a total of $%.2f.\n", totalCost);
    }
}

