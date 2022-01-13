package bowling.domain.state.bonus;

import bowling.domain.Pin;
import bowling.domain.state.State;
import bowling.domain.state.finished.Finished;

import java.util.Objects;

public class BonusMiss extends Finished {

    private final State state;
    private final Pin countOfPin;

    public BonusMiss(State state, int countOfPin) {
        this.state = state;
        this.countOfPin = new Pin(countOfPin);
    }

    @Override
    public String symbol() {
        return String.format(FORMAT_SYMBOL, state.symbol(), countOfPin.getCountOfPin());
    }

    public Pin getCountOfPin() {
        return countOfPin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BonusMiss)) return false;
        BonusMiss bonusMiss = (BonusMiss) o;
        return Objects.equals(countOfPin, bonusMiss.countOfPin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countOfPin);
    }
}
