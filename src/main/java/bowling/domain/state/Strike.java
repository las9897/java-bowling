package bowling.domain.state;

import bowling.domain.Pin;

public class Strike extends Finished {

    private static final String SYMBOL = " X ";

    public Pin getPin() {
        return Pin.MAX;
    }

    @Override
    public String symbol() {
        return SYMBOL;
    }
}
