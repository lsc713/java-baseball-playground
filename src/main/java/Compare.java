import java.util.List;

public class Compare {

    public int correctNumber(List<Integer> comList, List<Integer> playerList) {
        int result = 0;
        for (int i = 0; i < playerList.size(); i++) {
            if (comList.contains(playerList.get(i))) {
                result += 1;
            }
        }
        return result;
    }

    public int countStrike(List<Integer> comList, List<Integer> playerList) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (comList.get(i).equals(playerList.get(i))) strike++;
        }
        return strike;
    }
}
