package bowling.domain.state.bonus;

import bowling.domain.Pin;
import bowling.domain.state.State;
import bowling.domain.state.finished.Finished;

public class BonusLastStrike extends Finished {

    private final State state;
    private final Pin bonusStrikePin = Pin.MAX;


    public BonusLastStrike(State state) {
        this.state = state;
    }

    @Override
    public String symbol() {
        return String.join(DELIMITER, STRIKE_SYMBOL, STRIKE_SYMBOL, STRIKE_SYMBOL);
    }
}
