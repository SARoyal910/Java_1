import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean valid = false;

        while(!valid) {
            System.out.print("Enter password: ");
            String password = kb.nextLine();

            int uppercaseCount = 0;
            int lowercaseCount = 0;
            int digitCount = 0;

            for (int i = 0; i < password.length(); i++ ) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            boolean meetsUppercase = uppercaseCount >= 2;
            boolean meetsLowercase = lowercaseCount >= 3;
            boolean meetsDigit = digitCount >= 1;

            if (meetsUppercase && meetsLowercase && meetsDigit) {
                valid = true;
                System.out.println("Valid password.");
            } else {
                System.out.println("Invalid password.");
            }   if (!meetsUppercase){
                System.out.println("Password must contain at least 2 uppercase letters.");
            }   if (!meetsLowercase){
                System.out.println("Password must contain at least 3 lowercase letters.");
            }   if (!meetsDigit){
                System.out.println("Password must contain at least 1 number digits.");
            }
        }
    }
}
