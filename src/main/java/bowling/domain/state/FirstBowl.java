package bowling.domain.state;

import bowling.domain.Pin;
import bowling.domain.common.Running;
import bowling.domain.common.State;

public class FirstBowl extends Running {

    private final int countOfPin;

    public FirstBowl(int countOfPin) {
        this.countOfPin = countOfPin;
    }

    @Override
    public State bowl(int secondCountOfPin) {
        Pin.validationCountOfPin(this.countOfPin + secondCountOfPin);
        if (Pin.isMax(this.countOfPin + secondCountOfPin)) {
            return new Spare(this.countOfPin, secondCountOfPin);
        }
        return new Miss(this.countOfPin, secondCountOfPin);
    }
}
