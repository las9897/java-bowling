package bowling.domain.state;

import bowling.domain.Pin;

public class FirstBowl extends Running {

    private final int countOfPin;

    public FirstBowl(int countOfPin) {
        this.countOfPin = countOfPin;
    }

    @Override
    public BowlState bowl(int secondCountOfPin) {
        Pin.validationCountOfPin(this.countOfPin + secondCountOfPin);
        if (Pin.isMax(this.countOfPin + secondCountOfPin)) {
            return new Spare(this.countOfPin, secondCountOfPin);
        }
        return new Miss(this.countOfPin, secondCountOfPin);
    }
}
