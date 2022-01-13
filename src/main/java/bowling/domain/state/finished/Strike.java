package bowling.domain.state.finished;

import bowling.domain.Pin;

public class Strike extends Finished {

    public Pin getPin() {
        return Pin.MAX;
    }

    @Override
    public String symbol() {
        return STRIKE_SYMBOL;
    }
}
