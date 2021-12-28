package bowling.domain.state;

import bowling.domain.common.State;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MissTest {

    @Test
    @DisplayName("쓰러진 핀들의 합계가 10이 안되었을 때 Miss 반환")
    void miss() {
        //given
        State state = new FirstBowl(5);
        //then
        assertThat(state.bowl(4)).isInstanceOf(Miss.class);
    }
}