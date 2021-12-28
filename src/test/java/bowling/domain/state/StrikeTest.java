package bowling.domain.state;

import bowling.domain.common.State;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrikeTest {

    @Test
    @DisplayName("첫 투구가 10일 때 스트라이크")
    void strike() {
        //given
        State state = new Ready();
        //then
        assertThat(state.bowl(10)).isInstanceOf(Strike.class);
    }
}