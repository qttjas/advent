import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class dayOne {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbers.txt"));

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split(" {3}");
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
    }
}
