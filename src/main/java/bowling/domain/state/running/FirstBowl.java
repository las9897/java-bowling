package bowling.domain.state.running;

import bowling.domain.Pin;
import bowling.domain.state.State;
import bowling.domain.state.finished.Miss;
import bowling.domain.state.finished.Spare;

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

    @Override
    public String symbol() {
        return Pin.isGutter(countOfPin);
    }
}
