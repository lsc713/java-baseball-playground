import java.util.ArrayList;
import java.util.Collections;

public class BaseBall {
    public static void main(String[] args) {
        GenerateRandom random = new GenerateRandom();
        Input input = new Input();
        Judge judge = new Judge();
        PlayAgain playAgain = new PlayAgain();
        boolean again = true;

        while (again) {
            ArrayList<Integer> comList = new ArrayList<>();
            String result = "";
            while (!result.equals("3strike")) {
                result = judge.judgeMent(comList, input.playerNumber());
                System.out.println(result);
            }
            again= playAgain.playAgain();
        }

    }


}
