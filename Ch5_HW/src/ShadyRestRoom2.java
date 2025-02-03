import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double price = 0.0;
        boolean validRoom = true;

        System.out.println("Select a room type:");
        System.out.println("1. Queen bed ($125)");
        System.out.println("2. King Bed ($139)");
        System.out.println("3. Suite with a king bed and a pullout couch ($165)");
        System.out.println("Please choose an option (1-3):");

        int option = kb.nextInt();

        switch (option) {
            case 1:
                price = 125;
                System.out.println("1. Queen bed ($125)");
                break;
            case 2:
                price = 139;
                System.out.println("2. King Bed ($139)");
                break;
            case 3:
                price = 165;
                System.out.println("3. King suite with a pullout couch ($165)");
                break;
            default:
                System.out.println("Invalid option. Setting price to $0");
                price = 0.0;
                validRoom = false;
        }

        if (validRoom) {
            System.out.println("Select a view: ");
            System.out.println("1. Lake View (+$15)");
            System.out.println("2. Park View ");
            int viewChoice = kb.nextInt();

            if (viewChoice == 1) {
                price += 15;
                System.out.println("Lake view selected. $15 added.");
            } else if (viewChoice != 2) {
                System.out.println("Invalid view selection. Defaulting to Lake View (+$15).");
                price += 15;
            }
        }

        System.out.println("Total room price: $" + price);

    }
}

