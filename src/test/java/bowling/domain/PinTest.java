package bowling.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PinTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 11})
    @DisplayName("볼링핀 개수가 0~10 사이가 아닐 경우")
    void pinsSizeOverTest(int fallenPins) {
        //then
        assertThatIllegalArgumentException().isThrownBy(() -> new Pin(fallenPins));
    }

}