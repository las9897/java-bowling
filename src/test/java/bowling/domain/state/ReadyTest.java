package bowling.domain.state;

import bowling.domain.common.State;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class ReadyTest {
    private State state;

    @BeforeEach
    void setUp() {
        state = new Ready();
    }

    @Test
    @DisplayName("투구 수가 10이면 스트라이크 반환")
    void strike() {
        //then
        assertThat(state.bowl(10)).isInstanceOf(Strike.class);
    }

    @Test
    @DisplayName("투구 수가 0~9이면 FirstBowl 반환")
    void firstBowl() {
        //then
        assertThat(state.bowl(5)).isInstanceOf(FirstBowl.class);
    }

    @ParameterizedTest(name = "{index}: {0}")
    @ValueSource(ints = {-1, -3, -5, 11, 13, 15})
    @DisplayName("투구 수가 0 미만, 10초과일 때 예외 발생")
    void stateThrowException(int countOfPin) {
        //then
        assertThatIllegalArgumentException().isThrownBy(() -> state.bowl(countOfPin));
    }
}