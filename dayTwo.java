import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class dayTwo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbersTwo.txt"));
        int count = 0;

        while (scanner.hasNextLine()) {
            String report = scanner.nextLine();
            if (isSafe(report)) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }

    private static boolean isSafe(String report) {
        String[] levels = report.split(" ");
        int[] nums = new int[levels.length];

        for (int i = 0; i < levels.length; i++) {
            nums[i] = Integer.parseInt(levels[i]);
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                return false;
            }
            if (diff > 0) {
                decreasing = false;
            } else if (diff < 0) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
