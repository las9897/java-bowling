package bowling.domain.state.bonus;

import bowling.domain.state.BowlState;

public abstract class Bonus implements BowlState
{
    @Override
    public BowlState bowl(int countOfPin) {
        return null;
    }

    @Override
    public String symbol() {
        return null;
    }

    @Override
    public boolean isNotFinished() {
        return false;
    }
}
