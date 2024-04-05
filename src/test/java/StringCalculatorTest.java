import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class StringCalculatorTest {

    @Test
    @DisplayName("awkward calculator")
    void calculator() {
        String expression = "2 + 3 * 2";
        int result = StringCalculator.calculate(expression);

        Assertions.assertEquals(10,result);
    }
}