import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class dayTwo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbersTwo.txt"));
        String[] reports = scanner.nextLine().split("\n");
        int count = 0;

        for (String report: reports) {
            if (isSafe(report)) {
                count++;
            }
            System.out.println(count);
        }
    }

    private static boolean isSafe(String report) {

    }
}