package bowling.domain.state.finished;

import bowling.domain.Pin;

import java.util.Objects;

public class Miss extends Finished {

    private static final String SYMBOL_FORMAT = "%3s|%s ";
    private final Pin firstPin;
    private final Pin secondPin;

    public Miss(int firstPin, int secondPin) {
        this.firstPin = new Pin(firstPin);
        this.secondPin = new Pin(secondPin);
    }


    @Override
    public String symbol() {
        return String.format(SYMBOL_FORMAT, Pin.isGutter(firstPin.getCountOfPin()), Pin.isGutter(secondPin.getCountOfPin()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Miss)) return false;
        Miss miss = (Miss) o;
        return Objects.equals(firstPin, miss.firstPin) && Objects.equals(secondPin, miss.secondPin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPin, secondPin);
    }

    @Override
    public String toString() {
        return "Miss{" +
                "firstPin=" + firstPin +
                ", secondPin=" + secondPin +
                '}';
    }
}
