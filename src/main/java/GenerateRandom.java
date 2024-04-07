import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandom {

    public List<Integer> create() {
        List<Integer> comList = new ArrayList<>();
        while (comList.size() != 3) {
            int element = generateNumber();
            if (comList.contains(element)) {
                continue;
            }
            comList.add(element);
        }
        return comList;
    }

    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }

}
