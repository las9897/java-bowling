package bowling.domain.state.running;

import bowling.domain.Pin;
import bowling.domain.state.BowlState;
import bowling.domain.state.finished.Miss;
import bowling.domain.state.finished.Spare;

public class FirstBowl extends Running {

    private static final String SYMBOL_FORMAT = "%3s   ";

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

    @Override
    public String symbol() {
        return String.format(SYMBOL_FORMAT, Pin.isGutter(countOfPin));
    }
}
