import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallTest {

    @Test
    @DisplayName("generateNumber")
    void randomTest() {
        GenerateRandom random = new GenerateRandom();
        List<Integer> comList = random.create();
        assertThat(3).isEqualTo(comList.size());
    }
}