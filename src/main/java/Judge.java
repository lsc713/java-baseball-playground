import java.util.List;

public class Judge {
    Compare compare = new Compare();

    public String judgeMent(List<Integer> comList, List<Integer> playerList) {
        int strike = compare.countStrike(comList, playerList);
        int total = compare.correctNumber(comList, playerList);
        int ball = total - strike;

        if (total == 0) {
            return "nothing";
        } else if (strike == 0) {
            return ball + "ball";
        } else if (ball == 0) {
            return strike + "strike";
        }
        return ball + "ball" + strike + "Strke";
    }
}
