import java.util.Random;
import java.util.Scanner;

public class BaseBall {
    static Scanner sc = new Scanner(System.in);
    static boolean playAgain = true;

    public static void main(String[] args) {
        int[] generate = generate();
        while (playAgain) {
            System.out.print("숫자를 입력해주세요 : ");
            int input = sc.nextInt();
            checkMatch(input, generate);
        }
    }

    private static void checkMatch(int input, int[] generate) {
        int strike = 0;
        int ball = 0;
        int[] inputDigit = new int[3];
        inputDigit[0] = input / 100;
        inputDigit[1] = (input % 100) / 10;
        inputDigit[2] = input % 10;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (inputDigit[i] == generate[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        if (strike == 3) {
            System.out.println(strike + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int choice = sc.nextInt();
            playAgain = (choice == 1);

        } else {
            System.out.println(ball + "볼 " + strike + "스트라이크");

        }
    }

    public static int[] generate() {
        Random random = new Random();
        int[] ranNum = new int[3];
        boolean[] used = new boolean[10];
        for (int i = 0; i < ranNum.length; i++) {
            int num = 0;
            do {
                num = random.nextInt(9) + 1;
            } while (used[num]);
            ranNum[i]=num;
            used[num] = true;
        }
        return ranNum;
    }
}
