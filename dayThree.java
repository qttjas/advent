import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class dayThree {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbersThree.txt"));
        int sum =0;

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
                if (line.contains("mul(")) {
                    int start = line.indexOf("mul(");
                    int end = line.indexOf(")", start);
                    String nums = line.substring(start,end);

                    //String[] parts =scanner.nextLine().split(",");
                }
        }
    }
}