package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.*;


public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @DisplayName("set크기를 확인")
    @Test
    void setSize() {
        int size = numbers.size();
        assertThat(size).isEqualTo(3);
    }

    @DisplayName("중복을 제거하자")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void manyContains(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @DisplayName("중복제거 유연하게")
    @ParameterizedTest
    @CsvSource(value = {"1,true","2,true","3,true","4,false","5,false"},delimiter = ',')
    void setContain(String input, String expected) {
        assertThat(numbers.contains(Integer.parseInt(input))).isEqualTo(Boolean.parseBoolean(expected));
    }
}
