import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter your name " + (i + 1) + ":  ");
            names[i] = input.nextLine();
        }

        System.out.println("\nYour two name combinations are: ");

        System.out.println(names[0] + " " + names[1]);
        System.out.println(names[0] + " " + names[2]);
        System.out.println(names[1] + " " + names[0]);
        System.out.println(names[1] + " " + names[2]);
        System.out.println(names[2] + " " + names[0]);
        System.out.println(names[2] + " " + names[1]);

    }
}
