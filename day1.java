import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String numbers = "2   3" +
                         "3   4" +
                         "2   5";
        String[] result = numbers.split("   ");
        System.out.println("result = " + Arrays.toString(result));
    }
}