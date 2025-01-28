import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Sandwich sandwich = new Sandwich();


        System.out.print("Enter the main ingredient for the sandwich: ");
        String mainIngredient = scanner.nextLine();
        sandwich.setMainIngredient(mainIngredient);

        System.out.print("Enter the type of bread for the sandwich: ");
        String breadType = scanner.nextLine();
        sandwich.setBreadType(breadType);

        System.out.print("Enter the price of the sandwich: ");
        double price = scanner.nextDouble();
        sandwich.setPrice(price);


        System.out.println("\nSandwich Details:");
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());
    }
}

