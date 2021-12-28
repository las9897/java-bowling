package bowling.domain.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class FirstBowlTest {

    private BowlState state;

    @BeforeEach
    void setUp() {
        state = new FirstBowl(5);
    }


    @ParameterizedTest
    @ValueSource(ints = {-1, 11})
    @DisplayName("입력값이 음수이거나, 10을 초과하면 예외 발생")
    void secondCountOfPinIsNegativeOrOver10(int countOfPin) {
        //then
        assertThatIllegalArgumentException().isThrownBy(() -> state.bowl(countOfPin));
    }

    @Test
    @DisplayName("쓰러진 핀의 합계가 10을 초과할 경우 예외 발생")
    void sumOfPinOver10() {
        //then
        assertThatIllegalArgumentException().isThrownBy(() -> state.bowl(6));

    }
}