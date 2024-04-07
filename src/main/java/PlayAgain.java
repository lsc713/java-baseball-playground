import java.util.Scanner;

public class PlayAgain {
    public boolean playAgain() {
        System.out.println("if you want rerun input 1, or 2");
        Scanner sc = new Scanner(System.in);
        char answer = sc.next().charAt(0);
        if (answer == '1') {
            return true;
        }
        return false;
    }
}
