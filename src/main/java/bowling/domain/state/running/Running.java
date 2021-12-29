package bowling.domain.state.running;

import bowling.domain.state.BowlState;

public abstract class Running implements BowlState {
    @Override
    public boolean isNotFinished() {
        return true;
    }
}

