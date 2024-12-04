import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String args[]) throws IOException {
        String fileName = new String(Files.readAllBytes(Paths.get("file.txt")));

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        Scanner scanner = new Scanner(fileName);

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
        totalDistance += Math.abs(left.set(i, 2)- right.set(i, 2));
        }

    System.out.println(totalDistance);
    }
}
