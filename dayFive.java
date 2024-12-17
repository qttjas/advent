import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dayFive {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbersFive.txt"));
        ArrayList<int[]> total = new ArrayList<int[]>();
        ArrayList<int[]> nums = new ArrayList<int[]>();

        while (scanner.hasNextLine()) {
            if (scanner.nextLine().contains("|")) {
                String[] rules = scanner.nextLine().split("\\|");
                int[] newRules = new int[rules.length];
                for (int i = 0; i < rules.length; i++) {
                    newRules[i] = Integer.parseInt(rules[i]);
                }
                total.add(newRules);
            }
            if (scanner.nextLine().contains(",")) {
                String[] numbers = scanner.nextLine().split(",");
                int[] newNums = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    newNums[i] = Integer.parseInt(numbers[i]);
                }
                nums.add(newNums);
            }

            for (int[] numbers : nums) {
                boolean bool = true;
                for (int[] rules : total) {
                    boolean bools = check(numbers, rules);
                }
            }
        }
    }

    public static boolean isValid(int[] numbers, int[] rules) {
        int firstNum = rules[0];
        int secondNum = rules[1];
        boolean first = false;
        boolean second = false;
        boolean all = false;
        for (int number : numbers) {
            if (firstNum == number) {
                first = true;
            }
            if (secondNum == number) {
                second = true;
            }
            if (first && second) {
                all = true;
            }
        }
        return all;
    }

    public static boolean check(int[] numbers, int[] rules) {
        int firstNum = rules[0];
        int secondNum = rules[1];

        if (!isValid(numbers, rules)) {
            return true;
        }

        int firstIndex = -1;
        int secondIndex = -1;
    }
}
