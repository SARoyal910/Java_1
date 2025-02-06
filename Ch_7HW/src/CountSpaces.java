public class CountSpaces {
    public static void main(String[] args) {
        String quote = "Education among all kinds of men always has had, and always will have, " +
                "an element of danger and revolution, of dissatisfaction and discontent. " +
                "Nevertheless, men strive to know";

        int spaceCount = 0;

        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Total number of spaces: " + spaceCount);
    }
}
