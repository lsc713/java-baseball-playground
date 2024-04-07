import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class JudgeTest {
    Compare compare;
    Judge judge;

    @BeforeEach
    void setUp() {
        compare = new Compare();
        judge = new Judge();
    }

    @Test
    @DisplayName("3볼 확인")
    void ballCheck() {
        assertThat("3ball").isEqualTo(judge.judgeMent(Arrays.asList(1, 2, 3), Arrays.asList(3, 1, 2)));
    }

    @Test
    @DisplayName("3스트라이크 확인")
    void strikeCount() {
        Assertions.assertThat("3strike").isEqualTo(judge.judgeMent(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)));
    }

    @Test
    @DisplayName("nothing")
    void nothingCheck() {
        assertThat("nothing").isEqualTo(judge.judgeMent(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)));
    }
}
