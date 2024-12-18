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
        String regex = "mul\\([1-9][0-9]{0,2},[1-9][0-9]{0,2}\\)";
        String regexPartTwo = "do\\(\\)|don't\\(\\)";

        for (String line : input) {
            Matcher m = Pattern.compile(regex + "|" + regexPartTwo).matcher(line);
            while (m.find()) {
                patterns.add(m.group());
            }
        }
        int total = partTwo(patterns);
        System.out.println(total);
    }

    public static int partTwo(ArrayList<String> matches) {
        int total = 0;
        boolean process = true;

        for (String match : matches) {
            if (match.equals("do()")) {
                process = true;
            } else if (match.equals("don't()")) {
                process = false;
            } else if (match.startsWith("mul") && process) {
                total += doMulOperation(match);
            }
        }
        return total;
    }

    public static int doMulOperation(String operation) {
        int openParenthesis = operation.indexOf("(");
        int comma = operation.indexOf(",");
        int closeParenthesis = operation.indexOf(")");
        String first = operation.substring(openParenthesis + 1, comma);
        String second = operation.substring(comma + 1, closeParenthesis);
        return Integer.parseInt(first) * Integer.parseInt(second);
    }
}
