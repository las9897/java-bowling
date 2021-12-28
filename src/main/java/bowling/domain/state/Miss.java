package bowling.domain.state;

import bowling.domain.Pin;

public class Miss extends Finished {

    private final Pin firstPin;
    private final Pin secondPin;

    public Miss(int firstPin, int secondPin) {
        this.firstPin = new Pin(firstPin);
        this.secondPin = new Pin(secondPin);
    }

    @Override
    public String symbol() {
        return firstPin.getCountOfPin() + DELIMITER + secondPin.getCountOfPin();
    }
}
