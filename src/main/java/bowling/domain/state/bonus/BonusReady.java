package bowling.domain.state.bonus;

import bowling.domain.Pin;
import bowling.domain.state.State;
import bowling.domain.state.finished.Spare;
import bowling.domain.state.finished.Strike;
import bowling.domain.state.running.Running;

public class BonusReady extends Running {

    private final State state;

    public BonusReady(State state) {
        this.state = state;
    }

    @Override
    public State bowl(int countOfPin) {
        if (Pin.isMax(countOfPin) && state instanceof Strike) {
            return new BonusStrike(this);
        }

        if (Pin.isMax(countOfPin) && state instanceof Spare) {
            return new BonusStrikeBySpare(this);
        }

        return new BonusMiss(this, countOfPin);
    }

    @Override
    public String symbol() {
        return state.symbol();
    }

}
