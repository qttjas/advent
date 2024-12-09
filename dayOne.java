import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class dayOne {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbers.txt"));

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split("   ");
            left.add(Integer.parseInt(parts[0]));
            right.add(Integer.parseInt(parts[1]));
        }

        Collections.sort(left);
        Collections.sort(right);

        int totalDistance = 0;
        for (int i = 0; i<left.size(); i++) {
            totalDistance += Math.abs(left.get(i)- right.get(i));
        }

        System.out.println(totalDistance);

        int score = 0;
        for (int numLeft : left) {
            int count = 0;
            
            for (int numRight : right) {
                if (numLeft == numRight) {
                    count++;
                }
            }
            score += numLeft * count;
        }
        System.out.println(score);
    }
}
