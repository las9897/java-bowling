package bowling.domain.frame;

import bowling.domain.state.State;
import bowling.domain.state.running.Ready;

public abstract class AbstractFrame implements Frame {
    private final int index;
    protected State state = new Ready();

    public AbstractFrame(int index) {
        this.index = index;
    }

    @Override
    public void bowl() {

    }

    @Override
    public boolean isNotFinished() {
        return false;
    }
}
