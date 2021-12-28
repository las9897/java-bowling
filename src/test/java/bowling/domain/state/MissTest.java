package bowling.domain.state;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MissTest {

    @Test
    @DisplayName("쓰러진 핀들의 합계가 10이 안되었을 때 Miss 반환")
    void miss() {
        //given
        BowlState state = new FirstBowl(5);
        //then
        assertThat(state.bowl(4)).isInstanceOf(Miss.class);
    }
}