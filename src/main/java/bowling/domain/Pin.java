package bowling.domain;

public class Pin {
    private static final int MAX_PINS = 10;
    private static final int MIN_PINS = 0;

    private final int fallenPins;

    public Pin(int fallenPins) {
        validationPinCount(fallenPins);
        this.fallenPins = fallenPins;
    }

    private void validationPinCount(int fallenPins) {
        if (fallenPins > MAX_PINS || MIN_PINS > fallenPins) {
            throw new IllegalArgumentException(String.format("볼링 핀은 0 ~ 10개를 넘을 수 없습니다. 현재 쓰러진 핀 수는 %d", fallenPins));
        }
    }

    public Pin addPins(int addPins) {
        return new Pin(this.fallenPins + addPins);
    }

}
