package bowling.domain.state;

import bowling.domain.state.finished.Spare;
import bowling.domain.state.running.FirstBowl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpareTest {

    @Test
    @DisplayName("쓰러진 핀의 합계가 10일 경우 Spare 반환")
    void spare() {
        //given
        State state = new FirstBowl(5);
        //when
        State nextState = state.bowl(5);
        //then
        assertThat(nextState).isInstanceOf(Spare.class);
        assertThat(nextState.symbol()).contains("5|/");
    }
}