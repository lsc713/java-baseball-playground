import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        int result = calculate(q);
    }

    public static int calculate(String q) {
        String[] values = q.split(" ");

        int i = Integer.parseInt(values[0]);
        for (int j = 1; j < values.length; j += 2) {
            String operator = values[j];
            int operand = Integer.parseInt(values[j + 1]);
            if (values[j].equals("+")) {
                i += operand;
            } else if (values[j].equals("-")) {
                i -= operand;
            } else if (values[j].equals("*")) {
                i *= operand;
            } else if (values[j].equals("/")) {
                if (operand != 0) {
                    i /= operand;
                }
                throw new ArithmeticException("can't divide by 0");
            } else {
                throw new IllegalArgumentException("not supported operator");
            }
        }
        return i;
    }
}
