import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of dollars: ");
        int totalDollars = input.nextInt();

        int twenties = totalDollars / 20;
        int remainder = totalDollars % 20;

        int tens = remainder / 10;
        remainder = remainder % 10;

        int fives = remainder / 5;
        remainder = remainder % 5;

        int ones = remainder; 


        System.out.println("You have: ");
        System.out.println(twenties + " twenty-dollar bill(s)");
        System.out.println(tens + " ten-dollar bill(s)");
        System.out.println(fives + " five-dollar bill(s)");
        System.out.println(ones + " one-dollar bill(s)");
    }
}

