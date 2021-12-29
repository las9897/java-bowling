package bowling.domain;

import java.util.Objects;

public class Pin {
    private static final String MESSAGE_PIN_SIZE_EXCEPTION_FORMAT = "볼링핀은 0 ~ 10개를 넘을 수 없습니다. 입력값: %d";
    private static final int MAX_PINS = 10;
    public static final Pin MAX = new Pin(MAX_PINS);
    private static final int MIN_PINS = 0;
    private static final String GUTTER = "-";
    private final int countOfPin;

    public Pin(int countOfPin) {
        validationCountOfPin(countOfPin);
        this.countOfPin = countOfPin;
    }

    public static void validationCountOfPin(int countOfPin) {
        if (countOfPin > MAX_PINS || MIN_PINS > countOfPin) {
            throw new IllegalArgumentException(String.format(MESSAGE_PIN_SIZE_EXCEPTION_FORMAT, countOfPin));
        }
    }

    public static boolean isMax(int countOfPin) {
        return countOfPin == MAX_PINS;
    }

    public static String isGutter(int countOfPin) {
        return countOfPin == MIN_PINS ? GUTTER : String.valueOf(countOfPin);
    }

    public int getCountOfPin() {
        return countOfPin;
    }

    @Override
    public String toString() {
        return "Pin{" +
                "countOfPin=" + countOfPin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pin)) return false;
        Pin pin = (Pin) o;
        return getCountOfPin() == pin.getCountOfPin();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountOfPin());
    }
}
