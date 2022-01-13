package bowling.domain.state.bonus;

import bowling.domain.Pin;
import bowling.domain.state.State;
import bowling.domain.state.finished.Finished;

public class BonusStrikeBySpare extends Finished {

    private final State state;
    private final Pin bonusStrikePin = Pin.MAX;

    public BonusStrikeBySpare(State state) {
        this.state = state;
    }

    @Override
    public String symbol() {
        return String.format(FORMAT_SYMBOL, state.symbol(), STRIKE_SYMBOL);
    }
}
