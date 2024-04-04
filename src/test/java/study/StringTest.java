package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] split = "1,2".split(",");
        assertThat(split).contains("1").contains("2");
        String[] split1 = "1".split(",");
        assertThat(split1).containsExactly("1");
    }

    @Test
    void substring() {
        String substring = "(1,2)".substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    @DisplayName("특정 인자 가져오기")
    @Test
    void returnString() {
        char charAt = "abc".charAt(1);
        assertThat(charAt).isEqualTo('b');
    }

    @DisplayName("범위가 벗어났을때 에러")
    @Test
    void indexErrorTest() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            char result = "abc".charAt(3);
        });

    }


}
