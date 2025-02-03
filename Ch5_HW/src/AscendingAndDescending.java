import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.println("Enter the 1st integer: ");
        nums[0] = kb.nextInt();
        System.out.println("Enter the 2nd integer: ");
        nums[1] = kb.nextInt();
        System.out.println("Enter the 3rd integer: ");
        nums[2] = kb.nextInt();

        Arrays.sort(nums);
        System.out.println("Ascending order: " + nums[0] + " , " + nums[1] + " , " + nums[2]);
        System.out.println("Descending order: " + nums[2] + " , " + nums[1] + " , " + nums[0]);

    }
}
