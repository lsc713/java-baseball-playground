import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class CompareTest {

    Compare compare;

    @BeforeEach
    void setUp() {
        compare = new Compare();
    }

    @Test
    @DisplayName("숫자가 같은지에 대해 테스트")
    void count() {
        assertThat(3).isEqualTo(compare.correctNumber(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1)));
    }

    @Test
    @DisplayName("stirke count")
    void strike() {
        assertThat(1).isEqualTo(compare.countStrike(Arrays.asList(3, 2, 4), Arrays.asList(3, 1, 2)));
    }
}
