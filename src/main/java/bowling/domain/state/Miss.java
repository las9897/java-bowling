package bowling.domain.state;

import bowling.domain.Pin;
import bowling.domain.common.Finished;

public class Miss extends Finished {

    private final Pin firstPin;
    private final Pin secondPin;

    public Miss(int firstPin, int secondPin) {
        this.firstPin = new Pin(firstPin);
        this.secondPin = new Pin(secondPin);
    }
}
