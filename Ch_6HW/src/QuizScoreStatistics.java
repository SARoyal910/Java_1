import java.util.Scanner;

public class QuizScoreStatistics {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        double highest = -1;
        double lowest = 11;

        System.out.println("Enter quiz score (0 to 10): Enter 99 to finish. ");

        while (true) {
            System.out.println("Enter Score: ");
            double score = kb.nextDouble();

            if (score == 99) {
                break;
            }
            if (score < 0 || score > 10) {
                System.out.println("Invalid score. Please enter a score between 0 and 10.");
                continue;
            }
            count++;
            sum += score;
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        if (count > 0) {
            double average = sum / count;
            System.out.println("Number of valid scores entered: " + count);
            System.out.println("Highest score is " + highest);
            System.out.println("Lowest score is " + lowest);
            System.out.println("Average score is: " + average);
        } else {
            System.out.println("No valid scores entered.");
        }
    }
}
