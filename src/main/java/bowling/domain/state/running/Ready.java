package bowling.domain.state.running;

import bowling.domain.Pin;
import bowling.domain.state.State;
import bowling.domain.state.finished.Strike;

public class Ready extends Running {

    private static final String SYMBOL_FORMAT = "      ";

    @Override
    public State bowl(int countOfPin) {
        Pin.validationCountOfPin(countOfPin);
        if (Pin.isMax(countOfPin)) {
            return new Strike();
        }
        return new FirstBowl(countOfPin);
    }

    @Override
    public String symbol() {
        return SYMBOL_FORMAT;
    }
}
