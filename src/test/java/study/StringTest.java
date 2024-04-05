package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

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

    @Test
    @DisplayName("기이한 계산기")
    void calculate() {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");

        int result = Integer.parseInt(split[0]);

        for (int i = 1; i < split.length; i += 2) {
            String operator = split[i];
            int operand = Integer.parseInt(split[i + 1]);

            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            } else if (operator.equals("*")) {
                result *= operand;
            } else if (operator.equals("/")) {
                if (operand != 0) {
                    result /= operand;
                } else {
                    throw new ArithmeticException("can't divide with 0");
                }
            } else {
                throw new IllegalArgumentException("not supported");
            }
        }
    }

}
