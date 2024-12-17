import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class dayThree {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/numbersThree.txt"));
        ArrayList<String> input = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                input.add(line);
            }
        }
        scanner.close();

        ArrayList<String> patterns = new ArrayList<>();
        String pattern = "mul\\([1-9][0-9]{0,2},[1-9][0-9]{0,2}\\)";
        match(input, pattern, patterns);
        int sum = calculate(patterns);
        System.out.println(sum);
    }

    public static void match(ArrayList<String> lines, String regex, ArrayList<String> matches) {
        for (String line : lines) {
            Matcher m = Pattern.compile(regex).matcher(line);
            while (m.find()) {
                matches.add(m.group());
            }
        }
    }

    public static int calculate(ArrayList<String> matches) {
        int sum = 0;
        for (String match : matches) {
            String str = match.substring(4, match.length() - 1);
            String[] numbers = str.split(",");
            int numOne = Integer.parseInt(numbers[0]);
            int numTwo = Integer.parseInt(numbers[1]);
            sum += numOne * numTwo;
        }
        return sum;
    }
}
