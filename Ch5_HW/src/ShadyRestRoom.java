import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 0.0;

        System.out.println("Select a room type:");
        System.out.println("1. Queen bed ($125)");
        System.out.println("2. King Bed ($139)");
        System.out.println("3. Suite with a king bed and a pullout couch ($165)");
        System.out.println("Please choose an option (1-3):");

        int option = sc.nextInt();

        switch (option) {
            case 1: price = 125;
                System.out.println("1. Queen bed ($125)");
            break;
            case 2: price = 139;
            System.out.println("2. King Bed ($139)");
            break;
            case 3: price = 165;
            System.out.println("3. King suite with a pullout couch ($165)");
            break;
            default:
                System.out.println("Invalid option. Setting price to $0");
                price = 0.0;
        }
    }
}
