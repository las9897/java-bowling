package bowling.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PlayerTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"aaa", "BBBB"})
    @DisplayName("플레이어 이름 유효성 검사")
    void validationPlayerName(String name) {
        //given
        //when
        //then
        assertThatIllegalArgumentException().isThrownBy(() -> new Player(name));
    }
}