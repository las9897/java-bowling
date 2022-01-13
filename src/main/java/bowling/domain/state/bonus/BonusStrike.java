package bowling.domain.state.bonus;

import bowling.domain.Pin;
import bowling.domain.state.State;
import bowling.domain.state.running.Running;

public class BonusStrike extends Running {

    private final State state;

    public BonusStrike(State state) {
        this.state = state;
    }

    @Override
    public State bowl(int countOfPin) {
        if (Pin.isMax(countOfPin)) {
            return new BonusLastStrike(this);
        }
        return new BonusMiss(this, countOfPin);
    }

    @Override
    public String symbol() {
        return String.format(FORMAT_SYMBOL, state.symbol(), STRIKE_SYMBOL);
    }
}
