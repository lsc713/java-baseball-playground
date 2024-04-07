package study;

import baseball.ValidationUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    @DisplayName("야구_숫자_1_9_검증")
    public void invalid() throws Exception{
        //given
        Assertions.assertThat(ValidationUtils.validNo(9)).isTrue();
        Assertions.assertThat(ValidationUtils.validNo(1)).isTrue();
        Assertions.assertThat(ValidationUtils.validNo(0)).isFalse();
        Assertions.assertThat(ValidationUtils.validNo(10)).isFalse();
        //when

        //then

    }
}
