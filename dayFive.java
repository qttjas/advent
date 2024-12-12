import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dayFive {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbersFive.txt"));
        List<String> rules = new ArrayList<>();
        List<String> updates = new ArrayList<>();
        boolean reading = false;

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                reading= true;
            } else if (reading) {
                updates.add(str);
            } else {
                rules.add(str);
            }
        }
        scanner.close();

        int sum = 0;
        for (String update : updates) {
            List<Integer> pages = new ArrayList<>();

            
      }
    }
}
