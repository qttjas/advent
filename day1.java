import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String args[]) throws IOException {
       Scanner scanner = new Scanner(new File("numbers.txt"));

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split("   ");
            left.add(Integer.parseInt(parts[0]));
            right.add(Integer.parseInt(parts[1]));
        }

        scanner.close();
        Collections.sort(left);
        Collections.sort(right);

    int totalDistance = 0;
    for (int i = 0; i<left.size(); i++) {
        totalDistance += Math.abs(left.get(i_- right.get(i));
        }

    System.out.println(totalDistance);
    }
}
